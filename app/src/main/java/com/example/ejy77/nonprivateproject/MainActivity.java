package com.example.ejy77.nonprivateproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(getApplicationContext(), "테스트", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "테스트2", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "테스트3", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "테스트4", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "테스트5", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "테스트6", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "테스트7", Toast.LENGTH_SHORT).show();

    }
}
