package com.example.arjun_mu.a4singletonpattern;

import android.util.Log;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class CurrentUser {

    private static final String TAG = "CurrentUser";
    private String name;

    // Protect class from being instantiated
    private CurrentUser(){

    }
    // Create instance
    private static CurrentUser user=new CurrentUser();

    // Return only instance of user
    public static CurrentUser getUser(){
        return user;
    }
    // Set name
    protected  void setName(String n){
        name=n;

    }
    // Output user name
    protected void outputName() {
        Log.d(TAG, name);
    }

}
