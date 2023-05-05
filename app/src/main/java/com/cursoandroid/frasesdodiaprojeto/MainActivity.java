package com.cursoandroid.frasesdodiaprojeto;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] frase = {
                "frase 1",
                "frase 2",
                "frase 3",
                "frase 4"
        };
        int rand = new Random().nextInt(frase.length);
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frase[rand]);
    }
}