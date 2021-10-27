package com.example.diceroller2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // On utilise la classe Random
    Random rand = new Random();

    // La valeur du lancer est stockée dans un str
    String var_ = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // On identifie la view et le bouton
        TextView var = (TextView) findViewById(R.id.value);
        Button var2 = (Button) findViewById(R.id.roll);

        var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Le lancer de dé vaut un nombre aléatoire, modulo 6 (entre 0 et 5) auquel
                // on rajoute 1 (pour un résultat uniformément entre 1 et 6)
                var_ = Integer.toString(rand.nextInt(6) + 1);
                // Et on actualise l'affichage (l'utilisation de la variable intermédiaire n'est pas nécessaire)
                var.setText(var_);
            }
        });
    }
}