package com.example.pedro.tarefa1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class questao2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2);
        Log.i("LogCreate", "Activity criada");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LogPause", "Activity pausada");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LogDestroy", "Activity destruída");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("LogPostResume", "Activity POstResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LogRestart", "Activity ressucitada");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LogResume", "Activity resumida");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LogStart", "Activity startada");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LogStop", "Activity parada");
    }
}
