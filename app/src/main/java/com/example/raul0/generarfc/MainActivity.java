package com.example.raul0.generarfc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Crear objetos EditText
    EditText nombre;
    EditText apellidoP;
    EditText apellidoM;
    EditText fecha;
    EditText homonomia;
    EditText rfc;

    //Crear objetos botones
    Button BtnMostrar;
    Button BtnLimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=findViewById(R.id.EditTextNombre);
        apellidoP = findViewById(R.id.EditTextApellidoP);
        apellidoM = findViewById(R.id.EditTextApellidoM);
        fecha = findViewById(R.id.EditTextFecha);
        homonomia = findViewById(R.id.EditTextHomonima);
        rfc =findViewById(R.id.EditTextRfc);

        BtnMostrar =findViewById(R.id.ButtonMostrar);
        BtnLimpiar =findViewById(R.id.ButtonLimpiar);

        //Crear onclick para limpiar cajas



    }

    //Crear evento onClick para mostrar el RFC junto con la Homoclave

    public void Mostraronclick (View v){

        //Obtener texto de los EditTex
        String nombres = nombre.getText().toString();
        String apellidop = apellidoP.getText().toString();
        String apellidom = apellidoM.getText().toString();
        String fechas = fecha.getText().toString();

        //Invocar al método Generar RFC y almacenar su resultado

        String resultadorfc = ObtenerDatos(nombres,apellidop,apellidom,fechas);
        //Llamar al método ClaveHomoSAT para almacener la homoclave
        String homoclave = ClaveHomoSAT();

        //Asignar los valores obtenidos de los métodos en las cajas EditText
        rfc.setText(resultadorfc);
        homonomia.setText(homoclave);
    }

    //Crear evento onClick para limpiar las cajas de texto

    public void LimpiarOnclick (View v){
        nombre.setText(" ");
        apellidoP.setText(" ");
        apellidoM.setText(" ");
        fecha.setText(" ");
        homonomia.setText("");
        rfc.setText(" ");
    }

    //Método que requiere de los datos de la caja de Texto para procesarlos

    public String ObtenerDatos (String nombre,String apellidoP,String apellidoM, String fecha){

        //Mandar adecuar las cadenas para quitar espacios y poner en mayusculas
        String nombreAde = AdecuarCadena(nombre);
        String apellidoPAde = AdecuarCadena(apellidoP);
        String apellidoMAde = AdecuarCadena(apellidoM);
        String homoclave = ClaveHomoSAT();

        //Madar adecuar fecha para quitar los caracteres
        String  fechaAde= Formatofecha(fecha);

        //Declarar variable para almacenar el resultado
        String resultado ="";
        //Datos del apellido paterno
        String Apep = apellidoPAde.substring(0,2);
        //Datos del apellido materno
        String Apem = apellidoMAde.substring(0,1);
        //Datos del nombre
        String name = nombreAde.substring(0,1);

        //Datos de la fecha
        String dia = fechaAde.substring(0,2);
        String mes = fechaAde.substring(2,4);
        String yea = fechaAde.substring(6,8);

        //Acomodar datos del RFC en forma de cadena
        resultado = Apep + Apem + name + yea + mes + dia + homoclave;

        //Mandar los datos en forma de cadena
        return resultado;

    }

    //Método que quita los espacios y cambia vocales con acentos
    public String AdecuarCadena (String cadena){
        //Convertir la cadena en mayúsculas y quitar espacios en blanco
        String cadAdecu = cadena.toUpperCase().trim();
        //Declarar varible auxiliar
        String axu = "";

        //Arreglo de vocales con acentos
        char [] vocalesAcentuadas = {'Á','É','Í','Ó','Ú'};
        //Arreglo de vocales
        char [] vocales = {'A','E','I','O','U'};

        //Comparar y remplazar vocales que esten con acentos
        for (byte pos=0; pos < vocalesAcentuadas.length; pos++){
            //Encontrar la vocal
            axu = cadAdecu.replace(vocalesAcentuadas[pos],vocales[pos]);


        }

        return axu;


    }

    //Método para quiatar caraceres a la cadena fecha
    public String Formatofecha (String cadena){



        String remplazo = cadena.replace("/","");
        return remplazo;
    }

    //Método que permite crear la homoclave

    public String ClaveHomoSAT (){
        //Crear un arreglo del abecedario
        char letras [] = {'A','B','C','D','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        //Crear el objeto Random
        Random aleatorio = new Random(System.currentTimeMillis());
        //Crear los número para accder al arreglo del letras
        int primeraLetra = aleatorio.nextInt(25);
        int segundoLetra = aleatorio.nextInt(25);

        //Almacenar letras en una variable
        char letra1 =letras[primeraLetra];
        char letra2 =letras[segundoLetra];

        //Realizar un cast para pasar todos los valores a string
        String cadena = Character.toString(letra1);
        String cadena2 = Character.toString(letra2);
        String num = Integer.toString(segundoLetra);

        //Agrupar todos los datos en una sola cadena
        String homoclave = cadena + cadena2 + num;


        //Mandar el valor obtenido
        return homoclave;


    }


}
