package com.example.appdogv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //coneccion con BD
        ConectionSQLiteHelper conn = new ConectionSQLiteHelper(this, "bd_dietas_appdog", null, 1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,RegisterDataPetsActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);


    }
}
