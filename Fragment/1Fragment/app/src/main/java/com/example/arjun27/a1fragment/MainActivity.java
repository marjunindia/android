package com.example.arjun27.a1fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SimpleFragment simpleFragment;

    private static final String FRAGMENT_TAG = "fragment_tag";

    TextView textView;

    private  boolean mUseFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textView2);

    }

    // fragment transactions

    public void clickHandler(View view) {

        simpleFragment = new SimpleFragment();
        Bundle bundle=new Bundle();
        bundle.putString(SimpleFragment.MESSAGE_KEY,"pass as an argument");
        simpleFragment.setArguments(bundle); //passing argument from activity to fragment
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)  //recently added fragment remove when pressing back
                .add(R.id.container, simpleFragment)
                .commit();

        // using tags

//        getSupportFragmentManager()
//                .beginTransaction()
//                .addToBackStack(null)
//                .add(R.id.container, simpleFragment, FRAGMENT_TAG)
//                .commit();

    }

    public void removeclickHandler(View view) {

        // hanling rotations

         android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.container);
        //android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag(FRAGMENT_TAG);

        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }

    }

    public void measurehandler(View view) {
        Screenutility screenutility=new Screenutility(this);
        textView.setText(String.format("Width: %s,Height:%s",screenutility.getDpWidth(),screenutility.getDpHeight()));

        if(screenutility.getDpWidth()>=820){
            mUseFragment=true;
        }else{
            mUseFragment=false;
        }

        Toast.makeText(this, "Using fragment ? "+mUseFragment, Toast.LENGTH_SHORT).show();
    }
}
