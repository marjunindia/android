package com.example.arjun27.concurrency.JobScheduler;

import android.app.job.JobParameters;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

public class JobServirceWithThread extends android.app.job.JobService {

    public JobServirceWithThread() {
    }

    private static final String TAG = "JobService";

    @Override
    public boolean onStartJob(final JobParameters jobParameters) {
        Log.i(TAG, "onStartJob: "+jobParameters.getJobId());

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(new Intent("Servicemessage"));
                jobFinished(jobParameters,false);
            }
        };



        Thread thread=new Thread(runnable);
        thread.start();

        return false;  //return false completed task in current thread and thread or aysnk return true
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Log.i(TAG, "onStopJob: "+jobParameters.getJobId());
        return false;
    }




}
