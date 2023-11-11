package com.example.intentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Learn Android");
    }


    public  void launchSettings(View v)
    {
        Intent i= new Intent(this,SettingsActivity.class);
        startActivity(i);

    }

}