package com.example.arjun27.concurrency.JobScheduler;

import android.app.job.*;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.arjun27.concurrency.R;

public class JobActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
    }


    public  void  onClic(View view){

        JobScheduler jobScheduler= (JobScheduler) getSystemService(Context.JOB_SCHEDULER_SERVICE);

        JobInfo jobInfo=new JobInfo().Builder(1000,new ComponentName(this,JobService.class))

                ;


    }
}
