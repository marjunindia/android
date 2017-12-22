package com.example.arjun_mu.a5strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /*
     Its beauty lies in its versatility as it can be applied in numerous situations.
     Its purpose is to provide a selection of solutions (strategies) to a given problem at runtime.
      A good example would be an app with a strategy to run different code depending whether the app was being installed on
        Windows, Mac OS, or Linux. Were the system of designation we used above to design UIs
        for different devices so efficient, we could easily use a strategy pattern to carry out this task.

        For now, we will step ahead a little and imagine a situation where the users of our
        sandwich maker app are ready to pay. We will assume three methods: credit card, cash, and
        a coupon. Those paying cash will simply pay the set price. A little unfairly, those paying by
        card will be charged a small fee and those with a coupon will get 10% off. We will also use a
        singleton to represent the basic price before these strategies are applied.
    */

    Button card, cash, coupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card = (Button) findViewById(R.id.card);
        cash = (Button) findViewById(R.id.cash);
        coupon = (Button) findViewById(R.id.coupon);
        card.setOnClickListener(this);
        cash.setOnClickListener(this);
        coupon.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        BasicPrice basicPrice = BasicPrice.getBasicPrice();
        // Simulate price calculation
        basicPrice.setPrice(1.5f);
        Payment payment = null;
        switch (view.getId()) {
            case R.id.cash:
                payment = new Payment((new Cash()));
                break;
            case R.id.card:
                payment = new Payment(new Card());
                break;
            case R.id.coupon:
                payment = new Payment(new Coupon());
                break;

        }

        String price = new StringBuilder().append("Total cost:$")
                .append(payment.employStrategy(basicPrice.getPrice()))
                .append("c").toString();
        Toast toast = Toast.makeText(this, price, Toast.LENGTH_LONG);
        toast.show();
    }
}
