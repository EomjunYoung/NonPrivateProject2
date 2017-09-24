package com.example.ejy77.nonprivateproject;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity

{


    Button btn1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NotificationManager notificationManager = (NotificationManager)MainActivity.this.getSystemService(MainActivity.this.NOTIFICATION_SERVICE);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                builder.setTicker("??");
                builder.setContentTitle("뭘까?");
                builder.setContentText("대체 뭘까!!!?");
                builder.setDefaults(Notification.DEFAULT_SOUND);
                builder.setDefaults(Notification.DEFAULT_VIBRATE);

                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);
                builder.setAutoCancel(true);
                notificationManager.notify(1, builder.build());

            }
        });

    }
}