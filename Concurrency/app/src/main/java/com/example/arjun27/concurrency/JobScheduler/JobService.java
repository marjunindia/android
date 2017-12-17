package com.example.arjun27.concurrency.JobScheduler;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class JobService extends android.app.job.JobService {

    private static final String TAG = "JobService";
    public JobService() {
    }

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.i(TAG, "onStartJob: "+jobParameters.getJobId());
        jobFinished(jobParameters,false);
        return false;  //return false completed task in current thread and thread or aysnk return true
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Log.i(TAG, "onStopJob: "+jobParameters.getJobId());
        return false;
    }


}
