package com.example.examen_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btlogin, btregistro;
    EditText etusuario, etpasswordj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btlogin = findViewById(R.id.btlogin);
        btregistro = findViewById(R.id.btreg);
       etusuario = findViewById(R.id.etusuario);
       etpasswordj = findViewById(R.id.etpasswordj);


        btlogin.setOnClickListener(this);
        btregistro.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btlogin:{
                if(Objects.equals(etusuario.getText().toString(),"admin") &&
                Objects.equals(etpasswordj.getText().toString(),"1234"))
                {

                    Intent btlogin = new Intent(MainActivity.this, viaje.class);
                    btlogin.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(btlogin);
                    Toast.makeText(MainActivity.this,"Ingresando",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Usuario o Contraseña incorrecta", Toast.LENGTH_LONG).show();
                }

                break;}
            case R.id.btreg: {
                    Intent btregistro = new Intent(MainActivity.this, registro.class);
                    btregistro.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(btregistro);
            break;}


        }
    }
}



       /* switch (v.getId()) {
        case R.id.btlogin: {

        else{
        Toast.makeText(getApplicationContext(),"Usuario incorrecto",Toast.LENGTH_SHORT);
        }}
        case R.id.btregistro: {
        Intent btregistro = new Intent(MainActivity.this, registro.class);
        startActivity(btregistro);
        break;
        }
        Intent btregistro = new Intent(MainActivity.this, registro.class);
        startActivity(btregistro);
        }*/