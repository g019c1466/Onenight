package com.example.onenight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_name5 extends AppCompatActivity {

    protected static String name3;
    public EditText PersonName;
    public EditText PersonName2;
    public EditText PersonName3;
    public EditText PersonName4;
    public EditText PersonName5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_name5);
        PersonName = findViewById(R.id.editTextPersonName);
        PersonName2 = findViewById(R.id.editTextPersonName2);
        PersonName3 = findViewById(R.id.editTextPersonName3);
        PersonName4 = findViewById(R.id.editTextPersonName4);
        PersonName5 = findViewById(R.id.editTextPersonName5);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        String name = PersonName.getText().toString();
        Intent intent1 = new Intent(this, gamestart.class);
        startActivity(intent1);
        Intent intent2 = new Intent (getApplication(),gamestart.class);
        intent2.putExtra("name3",name);
        startActivity(intent2);
    }
}