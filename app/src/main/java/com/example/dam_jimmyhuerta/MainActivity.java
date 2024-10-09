package com.example.dam_jimmyhuerta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Encuentra el botón con el ID 'button_primero' y lo asigna a la variable 'btnl'
        Button btnl = findViewById(R.id.button_enviar);
        // Establece un listener para 'btnl' que muestra un mensaje de Toast cuando se hace clic
        btnl.setOnClickListener(View -> Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show());
    }
}