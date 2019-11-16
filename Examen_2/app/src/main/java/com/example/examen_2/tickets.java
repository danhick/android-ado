package com.example.examen_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tickets extends AppCompatActivity implements View.OnClickListener {
TextView redondo,tvsubtotal,iva1,total1;
EditText origen1,destino1,horarioida1,horariovuelta1,asiento1;
Button btpagar, btimprimir;
String datos;
Bundle tdatos;
    Boolean redondo1= false;
    Boolean vip=false;
    Integer contador=0;
    String hida="";
    String hvuelta="";
    String origen="";
    String vuelta="";
    int izamal=100;
    int valladolid=150;
    int tizimin=250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);

        btpagar = findViewById(R.id.btpagar);
        btimprimir = findViewById(R.id.btimprimir);
        origen1 = findViewById(R.id.origen1);
        destino1 = findViewById(R.id.destino1);
        redondo = findViewById(R.id.redondo);
        horarioida1 =findViewById(R.id.horarioida1);
        horariovuelta1 =findViewById(R.id.horariovuelta1);
        asiento1 =findViewById(R.id.asiento1);

        btpagar.setOnClickListener(this);
        btimprimir.setOnClickListener(this);
        tdatos = getIntent().getExtras();

        redondo1= tdatos.getBoolean("cbredondo");
        vip=tdatos.getBoolean("vip");
        contador=tdatos.getInt("contador");
        hida=tdatos.getString("hida");
        hvuelta=tdatos.getString("hvuelta");
        origen=tdatos.getString("origen");
        vuelta=tdatos.getString("vuelta");





    }

    @Override
    public void onClick(View v) {
if (btimprimir.isPressed()){

    origen1.setText(origen);

    /*if (redondo){*/
    destino1.setText(vuelta);
    //}

    horarioida1.setText(hida);
    asiento1.setText(contador.toString());
    horariovuelta1.setText(hvuelta);
}if (btpagar.isPressed()){
            double total=0;
            double subtotal =0;
            double subtotal1=0;
            double iva=0;

                switch (origen){
                    case "Izamal":
                        subtotal=izamal;
                        break;
                    case "Valladolid":
                        subtotal=valladolid;

                        break;
                    case "Tizimi":
                        subtotal=tizimin;
                        break;

                    }
                    subtotal=subtotal*contador;
                    if (redondo1) {
                        switch (vuelta) {
                            case "Izamal":
                                subtotal1 =  izamal;
                                break;
                            case "Valladolid":
                                subtotal1 =  valladolid;

                                break;
                            case "Tizimi":
                                subtotal1 =  tizimin;
                                break;

                        }
                        subtotal1=subtotal1*contador;
                    }
                    subtotal= subtotal+subtotal1;
                iva=subtotal*.16;
                total=subtotal+iva;



            }

        }


    }

