package com.example.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void login(View v){

        EditText campo1 = this.findViewById(R.id.campo1);
        String user = campo1.getText().toString();
        EditText campo2 = this.findViewById(R.id.campo2);
        String contrasenia = campo2.getText().toString();

        if(user.equals("c2") && contrasenia.equals("123")){
        Intent i = new Intent(this,Parte1Activity.class);
        startActivity(i);
        }else{
            Toast.makeText(this, "contraseña o usuario equivocado", Toast.LENGTH_SHORT).show();
        }
    }

    public void registra(View v){
        Intent i = new Intent(this,RegistraActivity.class);
        startActivity(i);
    }

    public void perder(View v){
        Intent i = new Intent(this, cuentaF.class);
        startActivity(i);
    }



}

