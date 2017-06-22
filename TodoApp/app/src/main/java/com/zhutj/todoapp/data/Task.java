package com.zhutj.todoapp.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

import java.util.UUID;

/**
 * Created by zhutj on 17/6/21.
 */

public final class Task {
    @NonNull
    private final String mId;

    @Nullable
    private final String mTitle;

    @Nullable
    private final String mDescription;

    private final boolean mCompleted;

    public Task(@Nullable String title,@Nullable  String description,@NonNull String id,boolean completed) {
        mTitle = title;
        mDescription = description;
        mId = id;
        mCompleted = completed;
    }

    public Task(@Nullable String title,@Nullable String description,@NonNull String id) {
        this(title, description, id, false);
    }

    public Task(@Nullable String title,@Nullable String description, boolean completed) {
        this(title, description, UUID.randomUUID().toString(), completed);
    }

    public Task(@Nullable String title,@Nullable String description) {
        this(title, description, UUID.randomUUID().toString(), false);
    }

    @NonNull
    public String getmId() {
        return mId;
    }

    @Nullable
    public String getmTitle() {
        return mTitle;
    }

    @Nullable
    public String getTilteforList() {
        if(Strings.isNullOrEmpty(mTitle)) {
            return mDescription;
        } else {
            return mTitle;
        }
    }

    @Nullable
    public String getDescription() {
        return mDescription;
    }

    public boolean isCompleted() {
        return mCompleted;
    }

    public boolean isActive() {return !mCompleted; }

    public boolean isEmpty() {
        return Strings.isNullOrEmpty(mTitle) && Strings.isNullOrEmpty(mDescription);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        Task task = (Task)obj;
        return Objects.equal(mId, task.mId) && Objects.equal(mTitle, task.mTitle)
                && Objects.equal(mDescription, task.mDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mId, mTitle, mDescription);
    }

    @Override
    public String toString() {
        return "Task with title " + mTitle;
    }
}
