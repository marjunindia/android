package com.example.arjun_mu.a4singletonpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /*

    Use a static class when you want a function performed on a variable you pass to
    it, for example, calculating the discount value on a price variable

    Use a singleton pattern when you want a complete object, but only one, and you
    want that object to be available to any part of the program, for example, an object
    representing the individual user currently logged into an app

    It is very handy when tasks are asynchronous, such as filing systems, and when we want access to its
    contents from anywhere in the code, such as the user name
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CurrentUser user = CurrentUser.getUser();
        user.setName("Singleton Pattern");
        user.outputName();
    }
}
