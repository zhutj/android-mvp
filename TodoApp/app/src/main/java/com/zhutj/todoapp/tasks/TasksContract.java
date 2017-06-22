package com.zhutj.todoapp.tasks;

import android.support.annotation.NonNull;

import com.zhutj.todoapp.BasePresenter;
import com.zhutj.todoapp.BaseView;
import com.zhutj.todoapp.data.Task;

import java.util.List;

/**
 * Created by zhutj on 17/6/21.
 */

public interface TasksContract {
    interface Persenter extends BasePresenter {
        void result(int requestCode,int resultCode);
        void loadTasks(boolean forceUpdate);

        void addNewTask();

        void openTaskDetails(@NonNull Task requestedTask);

        void completeTask(@NonNull Task completedTask);

        void activateTask(@NonNull Task activeTask);

        void clearCompletedTasks();

        void setFiltering(TasksFilterType requestType);

        TasksFilterType getFiltering();
    }

    interface View extends BaseView<Persenter> {
        void setLoadingIndicator(boolean active);

        void showTasks(List<Task> tasks);

        void showAddTask();

        void showTaskDetailsUi(String taskId);

        void showTaskMarkedComplete();

        void showTaskMarkedActive();

        void showCompletedTasksCleared();

        void showLoadingTasksError();

        void showNoTasks();

        void showActiveFilterLabel();

        void showCompletedFilterLabel();

        void showAllFilterLabel();

        void showNoActiveTasks();

        void showNoCompletedTasks();

        void showSuccessfullySavedMessage();

        boolean isActive();

        void showFilteringPopUpMenu();
    }
}
