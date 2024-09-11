package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Retraso de 2 segundos (2000 ms) antes de iniciar la próxima actividad
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Iniciar la LoginActivity (o cualquier otra actividad que desees)
                Intent intent = new Intent(SplashActivity.this, MainActivity.class); // Cambiado a LoginActivity
                startActivity(intent);
                finish(); // Termina la actividad de Splash para que no se pueda volver a ella
            }
        }, 2000); // 2 segundos de retraso
    }
}
