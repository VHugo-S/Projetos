package com.example.filmesteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Abertura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abertura);

        getSupportActionBar().hide();
    }

    public void onClickBotaoProximo(View view) {
        Intent intent = new Intent(this, FormLogin.class);
        startActivity(intent);
    }
}