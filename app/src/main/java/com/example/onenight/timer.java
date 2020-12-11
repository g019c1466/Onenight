package com.example.onenight;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class timer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        setTime();      //タイマー
        findViewById(R.id.stop_timer).setOnClickListener(this::onClick1); //画面転移
    }

    //制限時間
    public void setTime() {
        //config_timerから数値を取得
        Intent intent = getIntent();
        int min = intent.getIntExtra("min",0);
        int sec = intent.getIntExtra("sec",0);

        //制限時間の設定
        sec = sec * 10;
        time(min,sec);
    }

    //timer main
    public void time (int min,int sec) {
        int time_limit = ( min  * 60 + sec ) * 1000;

        CountDownTimer cdt = new CountDownTimer(time_limit, 100) {
            @SuppressLint("SetTextI18n")
            @Override
            public void onTick(long millisUntilFinished) {

                //text timeに表示するための設定
                int mm = (int) millisUntilFinished / 1000 / 60;      //分
                int ss = (int) millisUntilFinished / 1000 % 60;      //秒
                //表示
                TextView tv = (TextView) findViewById(R.id.write_time);
                tv.setText(mm + ":" + ss);
            }

            @Override
            public void onFinish() {
                finish();
            }
        }.start();
    }

    //画面転移
    public void onClick1(View view){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
        finish();
    }
}
