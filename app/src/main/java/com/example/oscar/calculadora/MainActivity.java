package com.example.oscar.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.oscar.calculadora.R.id.Bsumar;
import static com.example.oscar.calculadora.R.id.pant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = (TextView)findViewById(pant);
    }



    Boolean punto=false;
    boolean suma=false;
    boolean resta=false;
    boolean division=false;
    boolean multiplicacion=false;
    Double[] numero = new Double[100];
    Double result;
    CharSequence guardado;


    @Override
    public void onClick(View v) {


        Button n0 = (Button)findViewById(R.id.Boton0);
        n0.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.Boton1);
        n0.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.Boton2);
        n0.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.Boton3);
        n0.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.Boton4);
        n0.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.Boton5);
        n0.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.Boton6);
        n0.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.Boton7);
        n0.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.Boton8);
        n0.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.Boton9);
        n0.setOnClickListener(this);

        Button n10 = (Button)findViewById(R.id.Bdividir);
        n0.setOnClickListener(this);
        Button n11 = (Button)findViewById(R.id.Bmulti);
        n0.setOnClickListener(this);
        Button n12= (Button)findViewById(R.id.Brestar);
        n0.setOnClickListener(this);
        Button n13 = (Button)findViewById(R.id.Bsumar);
        n0.setOnClickListener(this);
        Button n14 = (Button)findViewById(R.id.Bborrar);
        n0.setOnClickListener(this);
        Button n15 = (Button)findViewById(R.id.Bpunto);
        n0.setOnClickListener(this);
        Button n16 = (Button)findViewById(R.id.Bresultado);
        n0.setOnClickListener(this);
        Button n17 = (Button)findViewById(R.id.Bgrabar);
        n0.setOnClickListener(this);
        Button n18 = (Button)findViewById(R.id.Bmemoria);
        n0.setOnClickListener(this);
        Button n19 = (Button)findViewById(R.id.Bborradig);
        n0.setOnClickListener(this);



        int seleccionado = v.getId();

        String a = pantalla.getText().toString();

        try {
            switch (seleccionado) {

                case R.id.Boton0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.Boton1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.Boton2:
                    pantalla.setText(a+"2");
                    break;
                case R.id.Boton3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.Boton4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.Boton5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.Boton6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.Boton7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.Boton8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.Boton9:
                    pantalla.setText(a+"9");
                    break;
                case R.id.Bpunto:
                    if(punto == false) {
                        pantalla.setText(a + ".");
                        punto = true;
                    }else{
                        return;
                    }
                    break;
                case R.id.Bdividir:
                    division=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    punto=false;
                    break;
                case R.id.Bmulti:
                    multiplicacion=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    punto=false;
                    break;
                case R.id.Brestar:
                    resta=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    punto=false;
                    break;
                case R.id.Bsumar:
                    suma=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    punto=false;
                    break;
                case R.id.Bresultado:
                    numero[1]=Double.parseDouble(a);

                    if(division==true){
                        if(numero[1]!=0){
                            result = numero[0] / numero[1];
                            pantalla.setText(String.valueOf(result));
                        }else {
                            pantalla.setText(String.valueOf("Error"));
                        }
                    }else if(resta==true){
                        result = numero[0] - numero[1];
                        pantalla.setText(String.valueOf(result));
                    }else if(multiplicacion==true){
                        result = numero[0] * numero[1];
                        pantalla.setText(String.valueOf(result));
                    }else if(suma==true){
                        result = numero[0] + numero[1];
                        pantalla.setText(String.valueOf(result));
                    }

                    punto=false;
                    division=false;
                    resta=false;
                    multiplicacion=false;
                    suma=false;
                    break;
                case R.id.Bborrar:
                    pantalla.setText("");
                    punto=false;
                    break;
                case R.id.Bgrabar:
                    guardado=pantalla.getText();
                    pantalla.setText("");
                    punto=false;
                    break;
                case R.id.Bmemoria:
                    pantalla.setText(guardado);
                    punto=false;
                    break;
                case R.id.Bborradig:
                        String resultado = (String) pantalla.getText();
                        if(resultado.length()>0){
                            resultado = resultado.substring(0, resultado.length()-1);
                            pantalla.setText(resultado);
                        }
                    punto=false;
                    break;

            }
        }catch(Exception e){pantalla.setText("Operacion no valida");};

    }

}
