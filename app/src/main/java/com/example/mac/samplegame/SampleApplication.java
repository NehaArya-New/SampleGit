package com.example.mac.samplegame;

import android.app.Application;

import com.nexref.visualintuition.sdk.app.VIApplication;

/**
 * Created by mac on 04/08/16.
 */
public class SampleApplication extends VIApplication{

    @Override
    public void onCreate() {
        super.onCreate();

        preloadVideo(true);
    }
}
