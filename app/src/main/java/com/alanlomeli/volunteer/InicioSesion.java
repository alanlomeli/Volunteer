package com.alanlomeli.volunteer;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class InicioSesion extends AppCompatActivity {
//nito
    Button Login, Singup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        Login = findViewById(R.id.btnLogin);
        Singup = findViewById(R.id.btnSingup);
    }

    public void btnIniciar (View view){
        Intent mostrarInicio = new Intent(this,MainActivity.class);
        startActivity(mostrarInicio);
    }

    public void btnRegistrar (View view){
        Intent mostrarRegistro = new Intent(this,activity_RegistroVoluntario.class);
        startActivity(mostrarRegistro);
    }
}
