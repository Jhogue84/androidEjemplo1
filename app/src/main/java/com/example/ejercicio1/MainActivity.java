package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //propidades
    public int contador;


    //metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //ciclo de vida de la activity
    /*
    @Override
    protected void onStart() {
        super.onStart();
        //mensajes emergentes:
        Toast.makeText(this, "onStart: A punto de iniciar", Toast.LENGTH_SHORT).show();git
        //onStart, la actividad esta a punto de iniciar.
    }
*/
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume - Mostrando aplicacion", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause - A punto de parar", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop - Cuando se detiene", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestar - A punto de reiniciar", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy - Finaliza la app", Toast.LENGTH_SHORT);
    }

    //mis propios metodos
    public void incrementar(View vista) {
        //aumentar mi variable contador
        contador++;
        mostraResultado(null);
    }

    public void decrementar(View vista) {
        contador--;
        mostraResultado(null);
    }

    public void reset(View vista) {
        contador = 0;
        mostraResultado(null);
    }

    //mostrrar resultado
    public void mostraResultado(View vista) {
        TextView resultado = findViewById(R.id.txtResultado);
        resultado.setText("" + contador);

    }
}