package com.example.arjun27.concurrency.TaskWithServices;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.arjun27.concurrency.R;

public class BoundServiceActivity extends AppCompatActivity {


    BoundService boundService;


    /*
        it a synchronous running in ui thread.you can create thread and asynck in the service and use broadcastreceiver in
        the service
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service);
    }

    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {

            BoundService.ServiceBinder serviceBinder = (BoundService.ServiceBinder) iBinder;
            boundService = serviceBinder.getService();

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

            if (boundService != null) {
                boundService = null;
            }

        }
    };

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(this, BoundService.class);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unbindService(serviceConnection);
    }

    public void coderun(View v) {
        boundService.getval();
    }
}
