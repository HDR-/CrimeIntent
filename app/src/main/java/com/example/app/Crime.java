package com.example.app;

import java.util.UUID;

/**
 * Created by heng on 14-1-28.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String title) {
        mTitle = title;
    }
}
