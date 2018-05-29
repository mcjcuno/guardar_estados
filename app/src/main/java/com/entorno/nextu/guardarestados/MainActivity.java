package com.entorno.nextu.guardarestados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mostrarmje;
    private static final String estadomje = "estado mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrarmje = (TextView) findViewById(R.id.mostrarmje);

        if (savedInstanceState!= null);{

            mostrarmje.setText(savedInstanceState.getString(estadomje));
        }



    }
    public void mostraronclick (View view){
        mostrarmje.setText("cacho");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(estadomje,mostrarmje.getText().toString());
    }
}
