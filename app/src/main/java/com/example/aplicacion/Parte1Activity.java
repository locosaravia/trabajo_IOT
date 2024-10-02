package com.example.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Parte1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.parte1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void cod(View v){
        Intent i = new Intent(this, buscarpl.class);
        startActivity (i);
    }

    public void apex(View v){
        Intent i = new Intent(this, buscarpl.class);
        startActivity (i);
    }

    public void csgo(View v){
        Intent i = new Intent(this, buscarpl.class);
        startActivity (i);
    }

    public void btf(View v){
        Intent i = new Intent(this, buscarpl.class);
        startActivity (i);
    }
}


