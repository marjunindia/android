package com.example.arjun27.concurrency;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class HandlerActivity extends AppCompatActivity {

    private static final String MESSAGE_KEY = "message";
    Handler mHandler;
    private static final String TAG = "HandlerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        mHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(Message msg) {
                Bundle bundle=msg.getData();
                String s=bundle.getString(MESSAGE_KEY);
                Log.i(TAG, "handleMessage: "+s);
                displayProgressBar(false);  //update ui

            }
        };
    }

    private void displayProgressBar(boolean b) {

    }

    public void click(View view){
        displayProgressBar(true);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, "run: starting thread  for 4 sec");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Log.i(TAG, "run: ending thread ");
                Message message=new Message();   // sending message from backfroung to main ui thread
                Bundle bundle=new Bundle();
                bundle.putString(MESSAGE_KEY,"thread complete");
                message.setData(bundle);
                mHandler.sendMessage(message);

            }
        };

        Thread thread=new Thread(runnable);
        thread.start();

    }
}
