package com.example.arjun27.concurrency;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorActivity extends AppCompatActivity {

    ExecutorService executorService;  //running multiple thread


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_executor);

        executorService= Executors.newFixedThreadPool(5);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        executorService.shutdown();
    }


    public void runcode(View v){

        for (int i = 0; i < 10; i++) {

            Runnable runnable= new BackgroundTask(i);
            executorService.execute(runnable);

        }

    }
}
