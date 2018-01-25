package com.example.arjun_mu.a17observerpattern;

import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Sandwich sandwich = new Sandwich();
    Observer order = new Order(sandwich);
    int notificationId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOrderClicked(View view) {
        // Subscribe to notifications
        sandwich.register(order);
        sendNotification(order.update());
    }

    public void onUpdateClicked(View view) {
// Mimic message from server
        sandwich.setReady(true);
        sendNotification(order.update());
    }

    private void sendNotification(String message) {
        NotificationCompat.Builder builder =
                (NotificationCompat.Builder)
                        new NotificationCompat.Builder(this)
                                .setSmallIcon(R.drawable.ic_launcher_background)
                                .setContentTitle("Sandwich Factory")
                                .setContentText(message);
        NotificationManager manager = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        manager.notify(notificationId, builder.build());
// Update notifications if needed
        notificationId += 1;
    }
}
