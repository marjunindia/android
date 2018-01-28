package com.example.arjun27.a5dialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CustomDialogFragment.CustomDialogInterface {

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

    public void customdialog(View view) {
        Person person=new Person("arjun");
        CustomDialogFragment customDialog=CustomDialogFragment.newInstance(person);
       // CustomDialogFragment customDialog=new CustomDialogFragment();
        customDialog.show(getSupportFragmentManager(),"CUSTOM_FRAGMENT");

    }

    @Override
    public void onDataEntryComplete(Person person) {
        Toast.makeText(this, ""+person.getName(), Toast.LENGTH_SHORT).show();
    }
}
