package com.julianmosquera.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.a1);


    }

    /**
     * Creamos un toast al darle al boton que le asinamos este método desde el XML
     * @param v
     */
    public void evento(View v){
        Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        "Hola Mundo", Toast.LENGTH_SHORT);

        toast1.show();



    }
};

