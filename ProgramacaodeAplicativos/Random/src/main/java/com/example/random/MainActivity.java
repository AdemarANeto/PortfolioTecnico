package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText d, l;
    TextView r;
    ImageView imgDado;
    int numDados, numLados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        d = findViewById(R.id.Dados);
        l = findViewById(R.id.Lados);
        r = findViewById(R.id.Resultado);
        imgDado = findViewById(R.id.Img);
    }

    public void Play(View jubismar) {
        try {
            numDados = Integer.parseInt(d.getText().toString());
            numLados = Integer.parseInt(l.getText().toString());
        } catch (Exception e) {
            numDados = 0;
            numLados = 0;
            Toast.makeText(this, "DIgite todas as informações", Toast.LENGTH_SHORT).show();
        }
        Random mauricio = new Random();
        String s = "Resultado:\n";
        // int q = 1;
        //while(q <= numDados){
        // q++;
        //s += "Dado "+q+": "+(mauricio.nextInt(numLados)+1)+"\n";
        // }
        // r.setText(s);

        int gerado = mauricio.nextInt(numLados) + 1;
        ViewGroup.LayoutParams tamanho = imgDado.getLayoutParams();
        tamanho.height = 300;
        tamanho.width = 300;
        imgDado.setLayoutParams(tamanho);
        if (numLados == 4) {
            if (gerado == 1) {
                imgDado.setImageResource(R.drawable.d4_1);
            } else if (gerado == 2) {
                imgDado.setImageResource(R.drawable.dado4_2);
            } else if (gerado == 3) {
                imgDado.setImageResource(R.drawable.dado4_3);
            } else if (gerado == 4) {
                imgDado.setImageResource(R.drawable.dado4_4);
            }

    }else if(numLados ==6){
             if(gerado ==1){
                 imgDado.setImageResource(R.drawable.d6_1);
             }
             else if(gerado ==2){
                 imgDado.setImageResource(R.drawable.d6_2);
             }
             else if(gerado ==3){
                 imgDado.setImageResource(R.drawable.d6_3);
             }
             else if(gerado ==4){
                 imgDado.setImageResource(R.drawable.d6_4);
             }
             else if(gerado ==5){
                 imgDado.setImageResource(R.drawable.d6_5);
             }
             else if(gerado ==6){
                 imgDado.setImageResource(R.drawable.d6_6);

             }
         }
    }
}