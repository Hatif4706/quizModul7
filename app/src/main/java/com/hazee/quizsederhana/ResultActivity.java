package com.hazee.quizsederhana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView txt_nilai;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_result);

    txt_nilai = findViewById(R.id.txt_nilai);


    int nilai = getIntent().getExtras().getInt("nilai");
    txt_nilai.setText(String.valueOf(nilai));


    }
}
