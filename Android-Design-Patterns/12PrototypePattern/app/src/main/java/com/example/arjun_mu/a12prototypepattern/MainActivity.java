package com.example.arjun_mu.a12prototypepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView primeText;
    TextView fibText;
    TextView cloneText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primeText=(TextView) findViewById(R.id.primetextView);
        fibText=(TextView)findViewById(R.id.fibnotextView);
        cloneText=(TextView)findViewById(R.id.clonetextView);
        // Load the cache once only
        SequenceCache.loadCache();
        // Lengthy calculation and display of prime result
        Sequence prime = (Sequence) SequenceCache.getSequence("1");
        primeText.setText(new StringBuilder()
                .append("prime: ")
                .append(prime.getResult())
                .toString());
        // Lengthy calculation and display of Fibonacci result
        Sequence fib = (Sequence) SequenceCache.getSequence("2");
        fibText.setText(new StringBuilder()
                .append("fibonocci: ")
                .append(fib.getResult())
                .toString());
        long result = 0;
        // Create a clone of already constructed object
        try {
            Sequence clone = (Fibonacci) new Fibonacci().clone();
             result = clone.getResult() / 2;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }

        // Display the result quickly
        cloneText.setText(new StringBuilder()
                .append("clonetext:") .append(String.valueOf(result))
                .toString());
    }
}
