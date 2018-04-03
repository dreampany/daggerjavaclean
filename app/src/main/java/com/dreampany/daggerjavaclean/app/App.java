package com.dreampany.daggerjavaclean.app;

import android.app.Activity;
import android.app.Application;

import com.dreampany.daggerjavaclean.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by nuc on 3/26/2018.
 */

public class App extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> injector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().app(this).build().inject(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return injector;
    }
}
