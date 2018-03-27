package com.dreampany.daggerjavaclean.app;

import android.app.Activity;
import android.app.Application;

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
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return injector;
    }
}
