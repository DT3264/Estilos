package com.example.estilos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityTemas.class);
            startActivity(intent);
        });
    }
}