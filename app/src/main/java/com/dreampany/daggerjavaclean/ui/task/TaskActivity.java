package com.dreampany.daggerjavaclean.ui.task;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.dreampany.daggerjavaclean.R;
import com.dreampany.daggerjavaclean.data.ApiService;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by nuc on 3/26/2018.
 */

public class TaskActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Inject
    ApiService apiService;

    @Inject
    TaskActivityService taskService;

    @BindView(R.id.api)
    TextView api;

    @BindView(R.id.task)
    TextView task;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        doApi();
        doTask();
    }

    private void doApi() {
        api.setText(apiService.getData());
    }

    private void doTask() {
        task.setText(taskService.getData());
    }

    @Override
    public DispatchingAndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }
}
