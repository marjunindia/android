package com.example.arjun27.concurrency.TaskWithServices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class BoundService extends Service {

    private static final String TAG = "BoundService";
    Binder mBinder=new ServiceBinder();

    public BoundService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;
    }

    class ServiceBinder extends Binder{

        BoundService getService(){
            return BoundService.this;
        }
    }

    public String getval(){
        return "from service";
    }
}
