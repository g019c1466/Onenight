package com.example.onenight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class number_of_people extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_of_people);
        //画面転移
        findViewById(R.id.people4).setOnClickListener(this::onClick1);
        findViewById(R.id.people5).setOnClickListener(this::onClick2);
        findViewById(R.id.people6).setOnClickListener(this::onClick3);

    }

    public void onClick1(View view) {
        Intent intent1 = new Intent(this, add_name4.class);
        startActivity(intent1);
    }

    public void onClick2(View view) {
        Intent intent2 = new Intent(this, add_name5.class);
        startActivity(intent2);
    }
    public void onClick3(View view) {
        Intent intent3 = new Intent(this, add_name6.class);
        startActivity(intent3);
    }

}