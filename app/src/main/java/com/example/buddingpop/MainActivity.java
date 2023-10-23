package com.example.buddingpop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
          ImageView profimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profimg=findViewById(R.id.profimg);
        profimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity();
            }
        });
    }
    public void OpenActivity(){
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}