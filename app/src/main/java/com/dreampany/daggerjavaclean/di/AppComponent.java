package com.dreampany.daggerjavaclean.di;

import com.dreampany.daggerjavaclean.app.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by nuc on 4/3/2018.
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        BuildersModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder app(App app);

        AppComponent build();
    }

    void inject(App app);
}
