package com.example.onenight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //メイン画面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //画面転移
        findViewById(R.id.new_game).setOnClickListener(this::onClick1);
        findViewById(R.id.rules).setOnClickListener(this::onClick2);
    }

    //画面転移onClick
    public void onClick1(View view){
        Intent intent1 = new Intent(this, number_of_people.class);
        startActivity(intent1);
    }
    public void onClick2(View view){
        Intent intent2 = new Intent(this,rules.class);
        startActivity(intent2);
    }
}