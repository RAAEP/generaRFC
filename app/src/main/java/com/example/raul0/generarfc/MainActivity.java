package com.example.raul0.generarfc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generarRFC(View v){

        //Tomar la primera letra y voc del appellido paterno
        EditText apellidoP = (EditText) findViewById(R.id.editText5);

        char primerLetraAP = (R.id.editText5).getText().charAt(0);

        //Tomar la primera letra y voc del appellido Materno

        //Tomar la primera letra del primer nombre

        //Tomar los ultimos dos dígitos del año de nacimiento

        //Tomar los ultimos dos dígitos del mes de nacimiento

        //Tomar los ultimos dos dígitos del día de nacimiento

        //Generar 3 caracteres (Letras mayúsculas o número)

        //Concatenar

    }
}
