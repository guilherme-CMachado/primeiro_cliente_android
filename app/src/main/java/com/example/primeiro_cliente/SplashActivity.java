package com.example.primeiro_cliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    String TAG = "AppPrimeiroCliente";
    int tempoDeEspera = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.d(TAG, "onCreate: Tela Splash Carregada...");
        trocarTela();
    }

    private void trocarTela(){
        Log.d(TAG, "trocarTela: Trocando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "run: Esperando um tempo...");
                Intent trocarTela = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(trocarTela);
                finish();
            }
        },tempoDeEspera);


    }
}