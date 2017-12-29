package com.example.arjun_mu.a8facadepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;

    /*

    The facade pattern is perhaps one of the simplest of the structural pattern to understand
    and create. As its name suggests, it act as a face that sits in front of a complex system. When
    programming client code, we never have to concern ourselves with the complex logic of the
    rest of our system, if we have a facade to represent it. All we have to do is deal with the
    facade itself, and this means we can devise facades to maximize simplicity.
    Think of the facade pattern like the simple keypad you might find on a typical vending
    machine. Vending machines are very complex systems, combining all manner of
    mechanical and physical components. However, to operate one, all we need is to know how
    to punch in a number or two on its keypad. The keypad is the facade and it hides all the
    complexity behind it.
     */

    /*
            Of course, the facade pattern in this example might seem pointless. The dispense()
        method does nothing more than display an image, and requires no simplification. However,
        in a more realistic simulation, the dispensing process would involve all manner of calls and
        checks, change has to be calculated, stock availability checked, and any number of servos
        need setting into action. The beauty of the facade pattern is that if we were to put all these
        procedures into place, we would not have to change a single line in our client code or
        facade class. A single call to dispenseDrink() will have the correct result, no matter how
        complex the logic behind it.
        Despite being very simple, the facade pattern is immensely useful in many situations where
        we want to present a simple and orderly interface for a complicated system. Far less simple
        but equally useful is the criteria (or filter) pattern, which allows us to interrogate complex
        data structures.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.imageView);
        Facade facade = new Facade();
        mImageView.setImageResource(facade.dispenseCrisps());
    }
}
