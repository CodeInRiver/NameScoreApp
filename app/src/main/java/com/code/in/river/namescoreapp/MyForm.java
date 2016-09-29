package com.code.in.river.namescoreapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MyForm extends AppCompatActivity {

    public static final String EXTRA_NAME = "com.code.in.river.namescoreapp.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);
    }

    public void getScore(View view){
        // EditTextを取得
        EditText myEditText = (EditText) findViewById(R.id.myEditText);

        // EditTextの中身を取得
        String myName = myEditText.getText().toString().trim();

        // 中身を見て条件分岐
        if(myName.equals("")) {
            // エラー処理
            // 1 setError
            myEditText.setError("Please enter your name!");

            // 2 Toast
//            Toast.makeText(
//                    this
//                    ,"Please enter your name!"
//                    ,Toast.LENGTH_LONG
//            ).show();

            // 3 Dialog
//            AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
//            alertBuilder
//                    .setTitle("Error!")
//                    .setMessage("Please enter your name!")
//                    .setPositiveButton("OK", null);
//
//            AlertDialog alertDialog = alertBuilder.create();
//            alertDialog.show();
        } else {
            //次の画面へ
            Intent intent = new Intent(this, MyResult.class);
            intent.putExtra(EXTRA_NAME, myName);
            startActivity(intent);
        }

    }
}
