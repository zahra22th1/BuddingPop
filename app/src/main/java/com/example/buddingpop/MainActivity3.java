package com.example.buddingpop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
 TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String username=getIntent().getStringExtra("keyname");
        txt1=(TextView) findViewById(R.id.txt1);
        txt1.setText(username);
    }
}