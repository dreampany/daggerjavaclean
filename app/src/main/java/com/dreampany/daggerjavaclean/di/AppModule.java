package com.dreampany.daggerjavaclean.di;

import android.content.Context;

import com.dreampany.daggerjavaclean.app.App;
import com.dreampany.daggerjavaclean.data.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nuc on 3/26/2018.
 */

@Module
public class AppModule {

    @Provides
    Context provideContext(App app) {
        return app.getApplicationContext();
    }

    @Singleton
    @Provides
    ApiService provideApiService() {
        return new ApiService();
    }
}
