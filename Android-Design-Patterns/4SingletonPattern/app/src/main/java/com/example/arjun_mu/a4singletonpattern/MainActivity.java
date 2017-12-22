package com.example.arjun_mu.a4singletonpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CurrentUser user = CurrentUser.getUser();
        user.setName("Singleton Pattern");
        user.outputName();
    }
}
