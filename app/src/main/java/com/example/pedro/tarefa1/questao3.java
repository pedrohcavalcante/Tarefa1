package com.example.pedro.tarefa1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class questao3 extends Activity {
    int valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3);

        Intent questao3 = getIntent();
        Bundle parametros  = questao3.getExtras();
        try{
            valor = Integer.parseInt(parametros.getString("valorIndo"));
        }catch (NullPointerException npe){
            Toast.makeText(this,"Erro",Toast.LENGTH_LONG).show();
        }

        Button botao = findViewById(R.id.button4);
        botao.setText(parametros.getString("valorIndo"));

    }

    public void funcaoVoltar(View view){
        Intent intent = new Intent();
        valor++;
        String valorIndo = Integer.toString(valor);
        intent.putExtra("valorRetornado", valorIndo);
        setResult(RESULT_OK,intent);
        finish();
    }
}
