package com.example.ejy77.nonprivateproject;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.ejy77.nonprivateproject.R.id.tv1;

/**
 * Created by ejy77 on 2017-09-24.
 */

public class MainActivity2 extends AppCompatActivity{

    TextView tv2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String string = intent.getStringExtra("Eom");


        tv2 = (TextView)findViewById(R.id.tv2);
        Toast.makeText(getApplicationContext(), "전달됬을랑까?", Toast.LENGTH_SHORT).show();
        tv2.setText(string);
        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_SHORT).show();
    }

    import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;


    public class NotificationSomething extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.notification_something);
            CharSequence s = "전달 받은 값은 ";
            int id=0;

            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                s = "error";
            }
            else {
                id = extras.getInt("notificationId");
            }
            TextView t = (TextView) findViewById(R.id.textView);
            s = s+" "+id;
            t.setText(s);
            NotificationManager nm =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

            //노티피케이션 제거
            nm.cancel(id);
        }

    }

}
