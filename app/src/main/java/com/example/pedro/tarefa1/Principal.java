package com.example.pedro.tarefa1;


import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Principal extends Activity{


    int valorRetornado = 0;
    Button botaoq3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("PrincipalOnCreate", "principal criada");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TextView texto  = findViewById(R.id.valorq3);
        botaoq3 = findViewById(R.id.button3);
        botaoq3.setText(Integer.toString(valorRetornado));

    }


    public void questao1(View view) {
        Intent questao1 = new Intent(getApplicationContext(), questao1.class);
        startActivity(questao1);
    }

    public void questao2(View view) {
        Intent questao2 = new Intent(getApplicationContext(), questao2.class);
        startActivity(questao2);
    }

    public void questao3(View view) {
        valorRetornado++;
        String mensagemIndo = Integer.toString(valorRetornado);
        Intent questao3 = new Intent(getApplicationContext(), questao3.class);
        questao3.putExtra("valorIndo", mensagemIndo);
        startActivityForResult(questao3, 22);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 22){
          valorRetornado = Integer.parseInt(data.getStringExtra("valorRetornado"));
          //TextView visualizar = findViewById(R.id.valorq3);
          //visualizar.setText(data.getStringExtra("valorRetornado"));
          botaoq3.setText(data.getStringExtra("valorRetornado"));
        }
    }

    @Override
    protected void onDestroy() {
        Log.i("PrincipalOnDestroy", "principal destruída");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.i("PrincipalOnStop", "Principal parada");
        super.onStop();
    }

    @Override
    protected void onStart() {
        Log.i("PrincipalOnStart", "Principal start");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("PrincipalOnStart", "Principal resume");

        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.i("PrincipalOnRestart", "Principal restart");
        super.onRestart();
    }

    @Override
    protected void onPostResume() {
        Log.i("PrincipalOnPostResume", "Principal on post resume");
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        Log.i("PrincipalOnPause", "Principal pausada");
        super.onPause();
    }
}
