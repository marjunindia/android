package com.example.arjun27.concurrency;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import static android.os.Build.VERSION_CODES.M;

public class AysncActivity extends AppCompatActivity {
    private static final String TAG = "AysncActivity";
    private MyAsync myTask;
    private boolean mTaskRunning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aysnc);





    }


    public void run(View view){

        myTask = new MyAsync();
        myTask.execute("red","green");



       MyAsync myAsync1=new MyAsync();
       myAsync1.execute("red1","green1");
    }


    class MyAsync extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            for (String value : strings) {
                Log.i(TAG, "doInBackground: "+value);
                publishProgress(value);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Thread all done"
        }


        @Override
        protected void onProgressUpdate(String... values) {
            Log.d(TAG, "onProgressUpdate() called with: values = [" + values + "]");
        }

        @Override
        protected void onPostExecute(String s) {
            Log.d(TAG, "onPostExecute() called with: s = [" + s + "]");
        }
    }
}
