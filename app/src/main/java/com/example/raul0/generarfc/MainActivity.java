package com.example.raul0.generarfc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    //Crear objetos EditText
    EditText nombre;
    EditText apellidoP;
    EditText apellidoM;
    //Crear objetos botones
    Button BtnMostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.editTextNombre);
        apellidoP = (EditText)findViewById(R.id.editTextApellidoP);
        apellidoM = (EditText)findViewById(R.id.editTextApellidoM);

        //Botones
        BtnMostrar = (Button)findViewById(R.id.acepta);

        //Obtener datos de los EditTex
        BtnMostrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String nombres = nombre.getText().toString();
                //El método obtiene el valor del EditText

                //Este metodo lo pone texto en los EditText
                apellidoM.setText(nombres);

            }

        });
    }

    public void generarRFC(View v){

        //Tomar la primera letra y voc del appellido paterno




        //Tomar la primera letra y voc del appellido Materno

        //Tomar la primera letra del primer nombre

        //Tomar los ultimos dos dígitos del año de nacimiento

        //Tomar los ultimos dos dígitos del mes de nacimiento

        //Tomar los ultimos dos dígitos del día de nacimiento

        //Generar 3 caracteres (Letras mayúsculas o número)

        //Concatenar

    }
}
