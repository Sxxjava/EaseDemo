package org.itsk.easedemo;

import android.app.Application;

import com.hyphenate.easeui.controller.EaseUI;

/**
 * Created by Ewen on 2016/6/14.
 */
public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        EaseUI.getInstance().init(this,null);
    }
}
