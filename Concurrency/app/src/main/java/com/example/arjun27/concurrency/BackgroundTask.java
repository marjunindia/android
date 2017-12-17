package com.example.arjun27.concurrency;

import android.util.Log;

/**
 * Created by arjun27 on 12/16/2017.
 */

public class BackgroundTask implements Runnable {

    int threadNumber;

    private static final String TAG = "BackgroundTask";

    public BackgroundTask(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        Log.i(TAG, "run: "+Thread.currentThread().getName()+"start"+threadNumber);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i(TAG, "run: "+Thread.currentThread().getName()+"end"+threadNumber);

    }
}
