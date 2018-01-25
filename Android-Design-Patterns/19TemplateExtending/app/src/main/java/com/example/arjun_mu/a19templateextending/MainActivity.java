package com.example.arjun_mu.a19templateextending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Print book
        ReadingMaterial document = new SelectedBook();
        document.fetchDocument();

//        // Print magazine
//        document=new SelectedMagazine();
//        document.fetchDocument();
    }
}
