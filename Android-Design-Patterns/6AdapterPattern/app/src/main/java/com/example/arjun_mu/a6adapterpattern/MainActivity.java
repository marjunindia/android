package com.example.arjun_mu.a6adapterpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   /*
    The key to the adapter pattern is the way that the adapter class implements the new interface and wraps the old one.
    It is easy to see how this pattern can be applied in many other circumstances where we need
    to convert one kind of interface into another. The adapter is one of the most useful and
    frequently applied structural patterns. In some ways, it is similar to the next pattern we will
    encounter, the bridge, in that they both have a class that is used to convert interfaces.

    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.text1);

        OldLocation oldLocation=new CustomerLocation();
        oldLocation.setBuilding("Town Hall");
        oldLocation.setFloor(3);
        oldLocation.setDesk(14);

        NewLocation newLocation=new Adapter(oldLocation);
        textView.setText(new StringBuilder()
                .append(newLocation.getBuilding())
                .append(", floor ")
                .append(newLocation.getFloor())
                .append(", desk ")
                .append(newLocation.getDesk())
                .toString());
    }
}
