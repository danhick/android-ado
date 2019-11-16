package com.example.examen_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class horario extends AppCompatActivity implements View.OnClickListener {
    RadioGroup hida,hvuelta ;
    RadioButton rb1,rb2, rb3,rb4,rb5,rb6,rb7,rb8,rb9;
    TextView tvhorario;
    Button btcomprar;
    Bundle h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);
        btcomprar = findViewById(R.id.btcomprar);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        rb5 = findViewById(R.id.rb5);
        rb6 = findViewById(R.id.rb6);
        rb7 = findViewById(R.id.rb7);
        rb8 = findViewById(R.id.rb8);
        rb9 = findViewById(R.id.rb9);
        tvhorario = findViewById(R.id.tvhorario);
        hvuelta =findViewById(R.id.hvuelta);
        hida = findViewById(R.id.hida);

        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);
        rb4.setOnClickListener(this);
        rb5.setOnClickListener(this);
        rb6.setOnClickListener(this);
        rb7.setOnClickListener(this);
        rb8.setOnClickListener(this);
        rb9.setOnClickListener(this);
        btcomprar.setOnClickListener(this);

        h = getIntent().getExtras();

        Boolean redondo = h.getBoolean("cbredond");
    for (int i=0; i<hvuelta.getChildCount();i++){
        hvuelta.getChildAt(i).setEnabled(redondo);
    }



    }

    @Override
    public void onClick(View v) {

        if (btcomprar.isPressed()){
            Integer horarioida=hida.getCheckedRadioButtonId();
            Integer horariovuelta=hvuelta.getCheckedRadioButtonId();
            RadioButton radiobuton3 = (RadioButton) findViewById(horarioida);
            RadioButton radiobuton4 = (RadioButton) findViewById(horariovuelta);
           // String conthora=radiobuton3.getText();
            //Toast.makeText(horario.this, radiobuton3.getText(), Toast.LENGTH_SHORT).show();
        Intent hora = new Intent(horario.this, tickets.class);
            hora.putExtra("cbredond", h.getBoolean("cbredond"));
            hora.putExtra("origen", h.getString("origen"));
            hora.putExtra("vuelta", h.getString("vuelta"));
            hora.putExtra("vip", h.getBoolean("vip"));
            hora.putExtra("contador",h.getInt("contador"));
            hora.putExtra("hida", radiobuton3.getText());
            hora.putExtra("hvuelta", radiobuton4.getText());

        startActivity(hora);
        }


    }

}

