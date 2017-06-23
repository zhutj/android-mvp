package com.zhutj.todoapp.data.source.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by zhutj on 17/6/23.
 */

public class TasksDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Tasks.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String BOOLEAN_TYPE = " INTEGER";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE" + TasksPresistenceContract.TaskEntry.TABLE_NAME + "(" +
                    TasksPresistenceContract.TaskEntry._ID + TEXT_TYPE + "PRIMARY KEY" + COMMA_SEP +
                    TasksPresistenceContract.TaskEntry.COLUMN_NAME_ENTRY_ID + TEXT_TYPE + COMMA_SEP +
                    TasksPresistenceContract.TaskEntry.COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
                    TasksPresistenceContract.TaskEntry.COLUMN_NAME_DESCRIPTION + TEXT_TYPE + COMMA_SEP +
                    TasksPresistenceContract.TaskEntry.COLUMN_NAME_COMPLETED + BOOLEAN_TYPE + ")";


    public TasksDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
