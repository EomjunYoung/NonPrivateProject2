package com.example.ejy77.nonprivateproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ejy77 on 2017-09-24.
 */

public class MainActivity2 extends AppCompatActivity{

    TextView tv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tv1 = (TextView)findViewById(R.id.tv1);
        Toast.makeText(getApplicationContext(), "WHY", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "WHY2", Toast.LENGTH_SHORT).show();
    }
}
