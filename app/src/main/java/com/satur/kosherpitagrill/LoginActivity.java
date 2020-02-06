package com.satur.kosherpitagrill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button bto_ingresar;
        Button bto_registrar;
        final EditText emailText;
        final EditText passwordText;

        bto_ingresar = findViewById(R.id.bto_ingresar);
        bto_registrar = findViewById(R.id.bto_registrar);
        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.passwordText);

        bto_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = emailText.getText().toString();
                String password = passwordText.getText().toString();
                if (usuario.equals("1") && (password.equals("1"))){
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(LoginActivity.this,"Usuario Incorrecto",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
