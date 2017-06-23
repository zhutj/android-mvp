package com.zhutj.todoapp.data.source.local;

import android.provider.BaseColumns;

/**
 * Created by zhutj on 17/6/23.
 */

public final class TasksPresistenceContract {
    public TasksPresistenceContract() {
    }

    public static abstract class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "task";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_DESCRIPTION = "desciption";
        public static final String COLUMN_NAME_COMPLETED = "completed";
    }
}
