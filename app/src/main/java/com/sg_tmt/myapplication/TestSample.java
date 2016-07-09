package com.sg_tmt.myapplication;

import android.app.Application;
import android.util.Log;

import io.repro.android.Repro;

/**
 * Created by kurono on 2016/07/09.
 */
public class TestSample extends Application{
    @Override
    public void onCreate() {
        Log.v("Action", "load");
        super.onCreate();
        Repro.setup(this, "e739f4fe-c995-4003-bd31-d38e4319aeaa");
        Repro.startRecording();

        // Start Recording
    }
    }
