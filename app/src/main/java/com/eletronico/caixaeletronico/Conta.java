package com.eletronico.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Conta extends AppCompatActivity {

    private Button botaoConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);

        botaoConta = findViewById(R.id.bt_conta);

        getSupportActionBar().hide();

       botaoConta.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            irParaActivitySenha();
           }
       });

    }
    private void irParaActivitySenha(){

        Intent intent = new Intent( this,Senha.class);
        startActivity(intent);
        finish();
    }
}