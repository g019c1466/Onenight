package com.example.onenight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

public class config_timer extends AppCompatActivity {

    public static int min;
    public static int sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_timer);

        maxMin();
        findViewById(R.id.CTbutton).setOnClickListener(this::onClick);
    }

    //設定
    private void maxMin(){
        //分
        NumberPicker min_picker = (NumberPicker)findViewById(R.id.num_min);
        min_picker.setMinValue(1);      //最小値
        min_picker.setMaxValue(5);      //最大値
        min_picker.setValue(3);         //初期値

        //秒
        NumberPicker sec_picker = (NumberPicker)findViewById(R.id.num_sec);
        final String[] sec_name = {"00","10","20","30","40","50"};
        sec_picker.setMinValue(0);      //最小値
        sec_picker.setMaxValue(5);      //最大値

        sec_picker.setDisplayedValues(sec_name);
    }

    private void onClick(View view){
        NumberPicker min_picker = (NumberPicker)findViewById(R.id.num_min);
        NumberPicker sec_picker = (NumberPicker)findViewById(R.id.num_sec);
        Intent intent = new Intent(getApplication(),timer.class);

        int idx_min = min_picker.getValue();
        intent.putExtra("min",idx_min);

        int idx_sec = sec_picker.getValue();
        intent.putExtra("sec",idx_sec);

        startActivity(intent);

        //画面転移timer
        Intent move = new Intent(this,timer.class);
        startActivity(move);
    }
}