package com.example.filmesteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Detalhes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        getSupportActionBar().setTitle("Sobre");

        TextView titulo = (TextView) findViewById(R.id.titulo_filme);
        TextView sinopse = (TextView) findViewById(R.id.sinopse_filme);
        TextView ano = (TextView) findViewById(R.id.ano_filme);
        TextView diretor = (TextView) findViewById(R.id.direcao_filme);
        TextView genero = (TextView) findViewById(R.id.genero_filme);
        TextView elenco = (TextView) findViewById(R.id.elenco_filme);
        RatingBar estrela = (RatingBar) findViewById(R.id.ratingbar_estrela);
        ImageView imagem = (ImageView) findViewById(R.id.imageView);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null) {
            titulo.setText(b.getString("TIT"));
            sinopse.setText(b.getString("SIN"));
            ano.setText(b.getString("DATA"));
            diretor.setText(b.getString("DIRETOR"));
            genero.setText(b.getString("GEN"));
            elenco.setText(b.getString("ELENCO"));
            imagem.setImageResource(b.getInt("IMA"));
            estrela.setProgress(Integer.valueOf(b.getString("EST")));
            //int imagemid = intent.getIntExtra("IMA", R.drawable.viuvanegra);
            //estrela.setProgress(b.getInt("EST"));

             //       imagem.setImageDrawable();
              //      b.getInt("IMA");

        }
    }

    public void onClickBotaoSProximo(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    }
