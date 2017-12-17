package com.example.arjun27.concurrency.TaskWithServices;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.arjun27.concurrency.R;

public class ServiceActivity extends AppCompatActivity {
    BroadcastReceiver mBroadcastReceiver;
    private static final String TAG = "ServiceActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        mBroadcastReceiver =new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

                String msg=intent.getStringExtra("msg_key");
                Log.d(TAG, "onReceive: "+msg);
            }
        };

    }


    @Override
    protected void onStart() {
        super.onStart();

        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(mBroadcastReceiver,new IntentFilter("message"));
    }


    @Override
    protected void onStop() {
        super.onStop();
        LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(mBroadcastReceiver);
    }

    public void runcode(View v){
        MyIntentService.startActionFoo(this,"val1","val2");

    }


}
