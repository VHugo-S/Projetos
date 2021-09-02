package com.example.projetosemestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    // Get the Intent that started this activity and extract the string
    Intent intent = getIntent();


    // Capture the layout's TextView and set the string as its text
    TextView textView = findViewById(R.id.textView);

}