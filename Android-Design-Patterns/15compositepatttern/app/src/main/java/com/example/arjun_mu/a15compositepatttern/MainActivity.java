package com.example.arjun_mu.a15compositepatttern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Builder builder = new Builder();
    // Inflate a single component
        builder.list.inflate();
    // Inflate a composite component
        builder.layout1().inflate();
        // Inflate nested components
        builder.layout2().inflate();
        builder.layout3().inflate();
    }
}
