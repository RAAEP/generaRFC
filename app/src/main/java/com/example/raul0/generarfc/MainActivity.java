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
        //EditText
        nombre = (EditText)findViewById(R.id.editTextNombre);
        apellidoP = (EditText)findViewById(R.id.editTextApellidoP);
        apellidoM = (EditText)findViewById(R.id.editTextApellidoM);

        //Botones
        BtnMostrar = (Button)findViewById(R.id.buttonMuestra);

        //Obtener datos de los EditTex
        BtnMostrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                //Hacer un método que devuelva en masyúsculas,
                //sin espacios al inicio o fin, sin espacios
                //Validar apellido paterno
                String apellidop = apellidoP.getText().toString().toUpperCase().trim();
                //Sustituir letras acentuadas

                char [] vocalesAcentuadas = {'Á','É','Í','Ó','Ú'};
                char [] vocales = {'A','E','I','O','U'};

                //Recorrer y sustituir las vocales acentuadas





            }

        });


    }

    public void GenerarRFC(View v){
        String apellidop = apellidoP.getText().toString().toUpperCase().trim();
        char [] vocalesAcentuadas = {'Á','É','Í','Ó','Ú'};
        char [] vocales = {'A','E','I','O','U'};
        boolean encontrada = false;

        for (byte pos=0; pos < vocales.length;pos++){

            if (apellidop.indexOf(vocales[pos]) >=0){
                encontrada =true;
                break;
            }
        }

        
    }

    public String edecuar (String cadena){
        String cadAux = cadena.toUpperCase().trim();

        char [] vocalesAcentuadas = {'Á','É','Í','Ó','Ú'};
        char [] vocales = {'A','E','I','O','U'};

        for (byte pos=0; pos < vocalesAcentuadas.length; pos++){
            cadAux.replace(vocalesAcentuadas[pos],vocales[pos]);


        }
        return cadAux;
    }


}
