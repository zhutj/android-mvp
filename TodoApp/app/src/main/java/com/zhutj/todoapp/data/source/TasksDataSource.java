package com.zhutj.todoapp.data.source;

import android.support.annotation.NonNull;

import com.zhutj.todoapp.data.Task;

import java.util.List;

/**
 * Created by zhutj on 17/6/23.
 * Main entry point for accessing tasks data.
 * 访问tasks数据的主入口
 *
 */

public interface TasksDataSource {
    interface LoadTasksCallback {
        void onTasksLoaded(List<Task> tasks);

        void onDataNotAvailable();
    }

    interface GetTaskCallback {
        void onTaskLoaded(Task task);

        void onDataNotAvailable();
    }

    void getTasks(@NonNull LoadTasksCallback callback);

    void getTask(@NonNull String taskId, @NonNull GetTaskCallback callback);

    void saveTask(@NonNull Task task);

    void completeTask(@NonNull Task task);

    void completeTask(@NonNull String taskId);

    void activateTask(@NonNull Task task);

    void activateTask(@NonNull String taskId);

    void clearCompletedTasks();

    void refreshTasks();

    void deleteAllTasks();

    void deleteTask(@NonNull String taskId);
}
