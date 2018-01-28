package com.example.arjun27.a5dialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showdialog(View view) {
        AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
        alertDialogFragment.setCancelable(false);
        alertDialogFragment.show(getSupportFragmentManager(), "DIALOG_FRAGMENT");
    }
}
