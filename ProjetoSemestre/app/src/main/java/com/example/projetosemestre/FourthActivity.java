package com.example.projetosemestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void onClickBotaoFProximo(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}