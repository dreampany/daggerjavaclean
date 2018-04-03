package com.dreampany.daggerjavaclean.ui.task;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nuc on 4/3/2018.
 */

@Module
public class TaskActivityModule {

    @Provides
    TaskActivityService provideTaskActivityService() {
        return new TaskActivityService();
    }
}
