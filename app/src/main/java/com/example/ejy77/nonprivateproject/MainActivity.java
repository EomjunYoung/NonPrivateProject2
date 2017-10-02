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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NotificationManager notificationManager = (NotificationManager)MainActivity.this.getSystemService(MainActivity.this.NOTIFICATION_SERVICE);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Eom", "인텐트 개꿀");
                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

                builder.setTicker("??");
                //상태바 한줄 메시지
                builder.setContentTitle("뭘까?");
                //상태바 드래그시 보이는 타이틀
                builder.setContentText("대체 뭘까!!!?");
                //상태바 드래그시 보이는 서브타이틀
                builder.setDefaults(Notification.DEFAULT_SOUND);
                builder.setDefaults(Notification.DEFAULT_VIBRATE);
                builder.setContentIntent(pendingIntent);
                builder.setAutoCancel(true);


                notificationManager.notify(1234, builder.build());
                // NotificationCompat.Builder를 통해 노티피케이션의 모든 내용을 설정한 이후엔
                // NotificationManager를 통해 .notify해줘야 한다.


            }
        });

    }
}