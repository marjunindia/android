package com.example.arjun_mu.a5strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


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
