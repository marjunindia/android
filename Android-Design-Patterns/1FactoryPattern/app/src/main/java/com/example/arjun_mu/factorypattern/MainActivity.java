package com.example.arjun_mu.factorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    The factory pattern is one of the most widely used creational patterns. As its name suggests,
    it makes things, or more precisely, it creates objects. Its usefulness lies in the way it uses a
    common interface to separate logic from use.
    /*
    generates objects to represent the different types of bread our sandwich builder app
    */
    /*
    The added layers of abstraction allow us to
    modify our classes without having to edit our activity and vice versa. This usefulness will
    become more apparent as we develop more complex objects and encounter situations that
    require more than a single factory.
     */

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=(TextView)findViewById(R.id.text1);

        BreadFactory breadFactory=new BreadFactory();
        Bread bread=breadFactory.getBread("BAG");
        mTextView.setText(new StringBuilder(bread.Calories().toString()));

    }
}
