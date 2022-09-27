package com.eletronico.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              ActivityConta();
            }
        },3000);//3 Segundos
    }

    private void ActivityConta(){

        Intent intent = new Intent(Splash.this,Conta.class);
        startActivity(intent);
        finish();
    }
}