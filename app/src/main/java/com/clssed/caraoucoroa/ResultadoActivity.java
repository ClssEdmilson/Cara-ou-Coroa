package com.clssed.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView image_resultado;
    private Button b_Voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);



        b_Voltar = findViewById(R.id.B_Voltar);
        image_resultado = findViewById(R.id.image_resultado);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("result");

        if(numero == 1){
            image_resultado.setImageResource(R.drawable.moeda_cara);
        }
        else {
            image_resultado.setImageResource(R.drawable.moeda_coroa);
        }

        b_Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}