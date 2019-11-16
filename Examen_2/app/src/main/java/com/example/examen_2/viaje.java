package com.example.examen_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class viaje extends AppCompatActivity implements View.OnClickListener {
Button btnormal,btvip;
RadioGroup ida,vuelta;
RadioButton rbtizimin,rbvalla,rbizamal,rbtizimin2,rbvalla2,rbizamal2;
CheckBox cbredondo;
EditText ettotal;
int valor1,valor2,valor3,valor4,valor5,valor6,valortotal,valorre;
Bundle cbredond;
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viaje);
        btnormal = findViewById(R.id.btnormal);
        btvip =findViewById(R.id.btvip);
        ida = findViewById(R.id.ida);
        vuelta = findViewById(R.id.vuelta);
        rbizamal = findViewById(R.id.rbizamal);
        rbizamal2 = findViewById(R.id.rbizamal2);
        rbtizimin = findViewById(R.id.rbtizimin);
        rbtizimin2 = findViewById(R.id.rbtizimin2);
        rbvalla = findViewById(R.id.rbvalla);
        rbvalla2 = findViewById(R.id.rbvalla2);
        cbredondo = findViewById(R.id.cbredondo);

        rbtizimin.setOnClickListener(this);
        rbtizimin2.setOnClickListener(this);
        rbvalla.setOnClickListener(this);
        rbvalla2.setOnClickListener(this);
        rbizamal2.setOnClickListener(this);
        rbizamal.setOnClickListener(this);
        cbredondo.setOnClickListener(this);
        btnormal.setOnClickListener(this);
        btvip.setOnClickListener(this);

        String origen,destino,red;
        Boolean vip;


    }

    @Override
    public void onClick(View v) {

        if (rbtizimin.isChecked()){
            rbtizimin2.setEnabled(false);

        }
        else{
            rbtizimin2.setEnabled(true);
        }
        if (rbvalla.isChecked()){
            rbvalla2.setEnabled(false);
        }
        else{
            rbvalla2.setEnabled(true);
        }
        if (rbizamal.isChecked()){
            rbizamal2.setEnabled(false);
        }
        else{
            rbizamal2.setEnabled(true);
        }

       if (cbredondo.isChecked()){

       }
        if (btnormal.isPressed()){
            Intent normal = new Intent(viaje.this, asiento.class);
            Integer idaid=ida.getCheckedRadioButtonId();
            Integer vueltaid=vuelta.getCheckedRadioButtonId();
            RadioButton radiobuton1 = (RadioButton) findViewById(idaid);
            RadioButton radiobuton2 = (RadioButton) findViewById(vueltaid);


            normal.putExtra("origen",radiobuton1.getText());
            normal.putExtra("vuelta",radiobuton2.getText());
            normal.putExtra("cbredond",cbredondo.isChecked());
            normal.putExtra("vip",false);

            startActivity(normal);
        }if (btvip.isPressed()){
           Intent normal = new Intent(viaje.this, asiento.class);
           Integer idaid=ida.getCheckedRadioButtonId();
           Integer vueltaid=vuelta.getCheckedRadioButtonId();
           RadioButton radiobuton1 = (RadioButton) findViewById(idaid);
           RadioButton radiobuton2 = (RadioButton) findViewById(vueltaid);


           normal.putExtra("origen",radiobuton1.getText());
           normal.putExtra("vuelta",radiobuton2.getText());
           normal.putExtra("cbredond",cbredondo.isChecked());
           normal.putExtra("vip",true);

           startActivity(normal);



       }



        }


}




