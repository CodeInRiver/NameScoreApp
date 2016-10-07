package com.code.in.river.namescoreapp;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MyResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MyForm.EXTRA_NAME);
        TextView nameLabel = (TextView) findViewById(R.id.nameLabel);
        nameLabel.setText(myName + "の点数は...");

        Random randomGenerator = new Random();
        int score = randomGenerator.nextInt(101); // 0-100

        TextView scoreLabel = (TextView) findViewById(R.id.scoreLabel);
        scoreLabel.setText(String.valueOf(score) + "点!!");

    }
}
