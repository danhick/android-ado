package com.example.examen_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registro extends AppCompatActivity implements View.OnClickListener {
Button btregistro;
EditText etcorreo, etusuario, etpassword,etpassword2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        btregistro = findViewById(R.id.btregistrar);
        etcorreo = findViewById(R.id.etcorreo);
        etusuario = findViewById(R.id.etusuario);
        etpassword = findViewById(R.id.etpassword);
        etpassword2 = findViewById(R.id.etpassword2);
        btregistro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btregistrar:

                Toast.makeText(registro.this,"Registrando usuario",Toast.LENGTH_SHORT).show();
                Intent btregistrar = new Intent(registro.this, MainActivity.class);
                btregistrar.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(btregistrar);
                break;
        }


    }
}
