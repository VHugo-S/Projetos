package com.example.filmesteste;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] dados;
    int[] dadosImg;

    public Adaptador(Context contexto, String[][] dados, int[] imagens)
    {
        this.contexto = contexto;
        this.dados = dados;
        this.dadosImg = imagens;

        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView titulo = (TextView) vista.findViewById(R.id.edit_titulo);
        TextView ano = (TextView) vista.findViewById(R.id.edit_ano);
        TextView genero = (TextView) vista.findViewById(R.id.edit_genero);

        ImageView imagem = (ImageView) vista.findViewById(R.id.filme_icone);
        RatingBar classificacao = (RatingBar) vista.findViewById(R.id.ratingbar);

        titulo.setText(dados[i][0]);
        genero.setText(dados[i][1]);
        ano.setText(dados[i][2]);
        imagem.setImageResource(dadosImg[i]);
        classificacao.setProgress(Integer.valueOf(dados[i][3]));


        imagem.setTag(i);

       /* imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(contexto, VisorImagen.class);
                visorImagen.putExtra("IMG", datosImg[(Integer)v.getTag()]);
                contexto.startActivity(visorImagen);
            }
        });*/


        return vista;
    }

    @Override
    public int getCount() {
        return dadosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
