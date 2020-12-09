package com.example.onenight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gamestart extends add_name5 {

    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamestart);

        Button button = findViewById(R.id.button2);


        button.setOnClickListener( v-> {
            Intent intent = getIntent();
            String name1 = intent.getStringExtra("name3");
            TextView textview = (TextView)findViewById(R.id.textView5);
            textview.setText(name1);
        });
    }
}