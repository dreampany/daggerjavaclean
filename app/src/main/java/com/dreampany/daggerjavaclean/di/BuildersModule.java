package com.dreampany.daggerjavaclean.di;

import com.dreampany.daggerjavaclean.ui.task.TaskActivity;
import com.dreampany.daggerjavaclean.ui.task.TaskActivityModule;
import com.dreampany.daggerjavaclean.ui.task.TaskFragment;
import com.dreampany.daggerjavaclean.ui.task.TaskFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by nuc on 4/3/2018.
 */

@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector(modules = TaskActivityModule.class)
    abstract TaskActivity bindTaskActivity();

    @ContributesAndroidInjector(modules = TaskFragmentModule.class)
    abstract TaskFragment bindTaskFragment();
}
