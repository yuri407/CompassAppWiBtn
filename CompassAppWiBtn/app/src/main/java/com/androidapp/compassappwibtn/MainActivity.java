package com.androidapp.compassappwibtn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnOpenCompass, btnMap;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenCompass = findViewById(R.id.btnOpenCompassView);
        btnOpenCompass.setOnClickListener(this);
        btnMap = findViewById(R.id.btnMap);
        btnMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnOpenCompassView:
                intent = new Intent(this, CompassActivity.class);
                startActivity(intent);
                break;
            case R.id.btnMap:
                intent = new Intent(this, MapsActivity.class);
                startActivity(intent);
                break;
            default: break;
        }

    }
}