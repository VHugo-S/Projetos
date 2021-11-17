package com.example.filmesteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    String[][] dados = {
            {"Viúva Negra", "Diretora: Cate Shortland", "2021", "40", "Ao nascer, a Viúva Negra, então conhecida como Natasha Romanova, é entregue à KGB, que a prepara para se tornar sua agente suprema. Porém, o seu próprio governo tenta matá-la quando a União Soviética se desfaz.", "Ação - Drama","Scarlett Johansson, Florence Pugh, David Harbour, O-T Fagbenle, Olga Kurylenko, William Hurt, Ray Winstone e Rachel Weisz."},
            {"O Esquadrão Suicida", "Diretor: James Gunn", "2021", "45", "O governo envia os supervilões mais perigosos do mundo para a remota ilha de Corto Maltese, repleta de inimigos. Armados com armas de alta tecnologia, eles viajam pela selva perigosa em uma missão de busca e destruição com o Coronel Rick Flag.",  "Ação - Comédia","Viola Davis, Margot Robbie, Idris Elba, Joel Kinnaman, John Cena, Jai Courtney,  Sylvester Stallone, Peter Capaldi..."},
            {"Duna", "Diretor: Denis Villeneuve", "2021", "45", "Paul Atreides é um jovem brilhante, dono de um destino além de sua compreensão. Ele deve viajar para o planeta mais perigoso do universo para garantir o futuro de seu povo.",  "Ficção científica - Aventura","Timothée Chalamet, Rebecca Ferguson, Oscar Isaac, Josh Brolin, Stellan Skarsgård, Dave Bautista, Zendaya, David Dastmalchian, Stephen Henderson, Charlotte Rampling, Jason Momoa e Javier Bardem."},
            {"Eternos", "Diretora: Chloé Zhao", "2021", "40", "Os Eternos são uma raça de seres imortais que viveram durante a antiguidade da Terra, moldando sua história e suas civilizações enquanto batalhavam os malignos Deviantes.","Aventura - Ação","Gemma Chan, Richard Madden, Kumail Nanjiani, Lia McHugh, Brian Tyree Henry, Lauren Ridloff, Barry Keoghan, Don Lee, Harish Patel, Kit Harington, Salma Hayek e Angelina Jolie."},
            {"Luca", "Diretor: Enrico Casarosa", "2021", "50", "Luca vive aventuras com seu novo melhor amigo, mas a diversão é ameaçada por um segredo: seu amigo é um monstro marinho de outro mundo que fica abaixo da superfície da água. ","Fantasia/Comédia"," Jacob Tremblay, Jack Dylan Grazer, Emma Berman, Marco Barricelli, Saverio Raimondo, Maya Rudolph e Jim Gaffigan"},
            {"Cruella", "Diretor: Craig Gillespie", "2021", "50", "Inteligente, criativa e determinada, Estella quer fazer um nome para si através de seus designs e acaba chamando a atenção da Baronesa Von Hellman. Entretanto, o relacionamento delas desencadeia um curso de eventos e revelações que fazem com que Estella abrace seu lado rebelde e se torne a Cruella, uma pessoa má, elegante e voltada para a vingança.",  "Comédia - Crime","Emma Stone, Emma Thompson, Joel Fry, Paul Walter Hauser, Emily Beecham e Mark Strong"},
            {"Casa Gucci", "Diretor: Ridley Scott", "2021", "20", "O casamento e o divórcio turbulento entre Patrizia e Maurizio Gucci leva a um assassinato.",  "Crime - Drama"," Lady Gaga e Adam Driver, Jared Leto, Jeremy Irons, Jack Huston, Salma Hayek e Al Pacino"},
            {"Matrix 4", "Diretora: Lana Wachowski", "2021", "30", "Atormentado por memórias estranhas, Neo é atraído para a Matrix novamente.",  "Ficção científic - Ação","Keanu Reeves e Carrie-Ann Moss, Lambert Wilson, Daniel Bernhardt e Jada Pinkett-Smith."},
            {"Shangi-Chi", "Diretor: Destin Cretton", "2021", "40", "Shang-Chi é o filho do líder de uma organização criminosa poderosa. O rapaz foi criado desde criança para ser um guerreiro, mas decidiu abandonar esse caminho e fugiu para viver uma vida pacífica. Porém, tudo isso muda quando ele é atacado por um grupo de assassinos e se vê forçado a enfrentar seu passado.",  "Ação - Fantasia"," Simu Liu, Awkwafina, Meng'er Zhang, Fala Chen, Florian Munteanu, Benedict Wong, Michelle Yeoh, Ben Kingsley e Tony Leung."},
            {"Free Guy", "Diretor: Shawn Levy", "2021", "20", "Um caixa de banco preso a uma entediante rotina tem sua vida virada de cabeça para baixo quando ele descobre que é personagem em um brutalmente realista vídeo game de mundo aberto. Agora ele precisa aceitar sua realidade e lidar com o fato de que é o único que pode salvar o mundo.",  "Ação - Aventura","Ryan Reynolds, Jodie Comer, Joe Keery, Lil Rel Howery, Utkarsh Ambudkar, Taika Waititi"},
            {"Encanto", "Diretores: Byron Howard, Jared Bush", "2021", "30", "Uma garota chamada Mirabel Madrigal cresce como o único membro não mágico de sua família, que vivem escondidos em uma vibrante casa encantada nas montanhas da Colômbia.","Musical - Fantasia","Stephanie Beatriz, John Leguizamo, María Cecilia Botero, Diane Guerrero, Jessica Darrow, Angie Cepeda, Wilmer Valderrama."},
            {"Alerta Vermelho", "Diretor: Rawson Marshall Thurber", "2021", "10", "Um alerta vermelho da Interpol é emitido e o agente do FBI John Hartley assume o caso. Durante sua busca, ele se vê diante de um assalto ousado e é forçado a se aliar ao maior ladrão de arte da história, Nolan Booth, para capturar a ladra de arte mais procurada do mundo atualmente, Sarah Black.",  "Ação - Aventura - Policial"," Dwayne Johnson, Gal Gadot, Ryan Reynolds"},

    };

    int[] dadosImg = {R.drawable.viuvanegra, R.drawable.tsquad, R.drawable.duna, R.drawable.eternos, R.drawable.luca,
                      R.drawable.cruella,R.drawable.gucci, R.drawable.matrix, R.drawable.shangchi, R.drawable.freeguy,
                      R.drawable.encanto, R.drawable.vermelho};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Lista Filmes");

        lista = (ListView) findViewById(R.id.lvLista);

        lista.setAdapter(new Adaptador(this, dados, dadosImg));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent visaoDet = new Intent(view.getContext(), Detalhes.class);

                visaoDet.putExtra("TIT", dados[position][0]);
                visaoDet.putExtra("SIN", dados[position][4]);
                visaoDet.putExtra("DATA",dados[position][2]);
                visaoDet.putExtra("DIRETOR",dados[position][1]);
                visaoDet.putExtra("ELENCO",dados[position][6]);
                visaoDet.putExtra("GEN",dados[position][5]);
                visaoDet.putExtra("IMA", dadosImg[position]);
                visaoDet.putExtra("EST", dados[position][3]);
                startActivity(visaoDet);
            }
        });
    }

    public void onClickBotaoSProximo(View view) {
        Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);
    }

}