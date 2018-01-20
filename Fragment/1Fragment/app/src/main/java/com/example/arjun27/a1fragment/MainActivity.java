package com.example.arjun27.a1fragment;

import android.app.Fragment;
import android.app.FragmentContainer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.fragment;

public class MainActivity extends AppCompatActivity {

    private SimpleFragment simpleFragment;

    private static final String FRAGMENT_TAG = "fragment_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
}
