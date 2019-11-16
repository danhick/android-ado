package com.example.examen_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class asiento extends AppCompatActivity implements View.OnClickListener {
    Button btsigue;
    TextView titulo;
    CheckBox asi1, asi2, asi3, asi4, asi5, asi6, asi7, asi8, asi9, asi10, asi11, asi12, asi13, asi14, asi15, asi16, asi17, asi18,
            asi19, asi20;
    Integer contador = 0;
    Bundle datosviaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asiento);
        btsigue = findViewById(R.id.btsigue);
        titulo = findViewById(R.id.tvtitulo1);
        asi1 = findViewById(R.id.asi1);
        asi2 = findViewById(R.id.asi2);
        asi3 = findViewById(R.id.asi3);
        asi4 = findViewById(R.id.asi4);
        asi5 = findViewById(R.id.asi5);
        asi6 = findViewById(R.id.asi6);
        asi7 = findViewById(R.id.asi7);
        asi8 = findViewById(R.id.asi8);
        asi9 = findViewById(R.id.asi9);
        asi10 = findViewById(R.id.asi10);
        asi11 = findViewById(R.id.asi11);
        asi12 = findViewById(R.id.asi12);
        asi13 = findViewById(R.id.asi13);
        asi14 = findViewById(R.id.asi14);
        asi15 = findViewById(R.id.asi15);
        asi16 = findViewById(R.id.asi16);
        asi17 = findViewById(R.id.asi17);
        asi18 = findViewById(R.id.casi18);
        asi19 = findViewById(R.id.asi19);
        asi20 = findViewById(R.id.asi20);


        asi1.setOnClickListener(this);
        asi2.setOnClickListener(this);
        asi3.setOnClickListener(this);
        asi4.setOnClickListener(this);
        asi5.setOnClickListener(this);
        asi6.setOnClickListener(this);
        asi7.setOnClickListener(this);
        asi8.setOnClickListener(this);
        asi9.setOnClickListener(this);
        asi10.setOnClickListener(this);
        asi11.setOnClickListener(this);
        asi12.setOnClickListener(this);
        asi13.setOnClickListener(this);
        asi14.setOnClickListener(this);
        asi15.setOnClickListener(this);
        asi16.setOnClickListener(this);
        asi17.setOnClickListener(this);
        asi18.setOnClickListener(this);
        asi19.setOnClickListener(this);
        asi20.setOnClickListener(this);
        btsigue.setOnClickListener(this);


        datosviaje = getIntent().getExtras();

        /*Boolean redondo = datosviaje.getBoolean("cbredond");
        String origen = datosviaje.getString("origen");
        String vuelta = datosviaje.getString("vuelta");
        Boolean vip = datosviaje.getBoolean("vip");*/

        //titulo.setText(redondo.toString()+origen+vuelta+vip.toString());


    }

    @Override
    public void onClick(View v) {


        if (btsigue.isPressed()) {
            contador = 0;
            if (asi1.isChecked()) {
                contador = contador + 1;
            }
            if (asi2.isChecked()) {
                contador = contador + 1;
            }
            if (asi3.isChecked()) {
                contador = contador + 1;
            }
            if (asi4.isChecked()) {
                contador = contador + 1;
            }
            if (asi5.isChecked()) {
                contador = contador + 1;
            }
            if (asi6.isChecked()) {
                contador = contador + 1;
            }

            if (asi7.isChecked()) {
                contador = contador + 1;
            }
            if (asi8.isChecked()) {
                contador = contador + 1;
            }
            if (asi9.isChecked()) {
                contador = contador + 1;
            }
            if (asi10.isChecked()) {
                contador = contador + 1;
            }
            if (asi11.isChecked()) {
                contador = contador + 1;
            }
            if (asi12.isChecked()) {
                contador = contador + 1;
            }
            if (asi13.isChecked()) {
                contador = contador + 1;
            }
            if (asi14.isChecked()) {
                contador = contador + 1;
            }
            if (asi15.isChecked()) {
                contador = contador + 1;
            }
            if (asi16.isChecked()) {
                contador = contador + 1;
            }
            if (asi17.isChecked()) {
                contador = contador + 1;
            }
            if (asi18.isChecked()) {
                contador = contador + 1;
            }
            if (asi19.isChecked()) {
                contador = contador + 1;
            }
            if (asi20.isChecked()) {
                contador = contador + 1;
            }

            titulo.setText(contador.toString());

            //Integer as=h.getInt("contador");
           //Toast.makeText(asiento.this, datosviaje.toString(), Toast.LENGTH_SHORT).show();
            Intent ah = new Intent(asiento.this, horario.class);
            ah.putExtra("cbredond", datosviaje.getBoolean("cbredond"));
            ah.putExtra("origen", datosviaje.getString("origen"));
            ah.putExtra("vuelta", datosviaje.getString("vuelta"));
            ah.putExtra("vip", datosviaje.getBoolean("vip"));
            ah.putExtra("contador", contador);


            startActivity(ah);

        }
    }


}


