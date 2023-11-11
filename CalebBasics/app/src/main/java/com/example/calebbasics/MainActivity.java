package com.example.calebbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button);
    }

    public void handler(View v)
    {
        v.setEnabled(false);
        Log.d("My Log","Message");
        Toast.makeText(this,"Alert Toast",Toast.LENGTH_LONG).show();

    }

}