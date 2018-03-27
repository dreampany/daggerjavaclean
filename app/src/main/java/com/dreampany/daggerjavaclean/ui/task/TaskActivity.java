package com.dreampany.daggerjavaclean.ui.task;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.dreampany.daggerjavaclean.R;
import com.dreampany.daggerjavaclean.data.ApiService;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

/**
 * Created by nuc on 3/26/2018.
 */

public class TaskActivity extends AppCompatActivity {

    @Inject
    ApiService apiService;

    @Inject
    TaskService taskService;

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

    private void doApi() {
        api.setText(apiService.getData());
    }

    private void doTask() {
        task.setText(taskService.getData());
    }

}
