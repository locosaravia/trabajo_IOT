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

public class RegistraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.registra);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sumbit(View v) {

        EditText campo1 = this.findViewById(R.id.username);
        String user = campo1.getText().toString();
        EditText campo2 = this.findViewById(R.id.email);
        String email = campo2.getText().toString();
        EditText campo3 = this.findViewById(R.id.paswordRe);
        String password = campo3.getText().toString();
        EditText campo4 = this.findViewById(R.id.AGE);
        String edad = campo4.getText().toString();


        if (user.equals("c2") && email.equals("alex.gahona@gmail.com") && password.equals("1234") && edad.equals("18")) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "faltan datos por completar", Toast.LENGTH_SHORT).show();
        }

    }
}