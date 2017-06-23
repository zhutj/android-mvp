package com.zhutj.todoapp.tasks;

import android.support.annotation.NonNull;

import com.zhutj.todoapp.data.Task;

/**
 * Created by zhutj on 17/6/22.
 * Listens to user actions from UI  {@link TasksFragment} ,retrieves the data and update the UI
 * as required
 */

public class TasksPresenter implements TasksContract.Persenter {

    @Override
    public void start() {

    }

    @Override
    public void result(int requestCode, int resultCode) {

    }

    @Override
    public void loadTasks(boolean forceUpdate) {

    }

    @Override
    public void addNewTask() {

    }

    @Override
    public void openTaskDetails(@NonNull Task requestedTask) {

    }

    @Override
    public void completeTask(@NonNull Task completedTask) {

    }

    @Override
    public void activateTask(@NonNull Task activeTask) {

    }

    @Override
    public void clearCompletedTasks() {

    }

    @Override
    public void setFiltering(TasksFilterType requestType) {

    }

    @Override
    public TasksFilterType getFiltering() {
        return null;
    }
}
