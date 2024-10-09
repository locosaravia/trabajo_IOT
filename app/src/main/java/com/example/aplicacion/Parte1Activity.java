package com.example.aplicacion;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

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

        TabLayout tl = (TabLayout) findViewById(R.id.layuttab);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position){
                    case 0:
                        clanlisto c = new clanlisto();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,c).commit();
                        break;
                    case 1:
                        tornament t = new tornament();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,t).commit();
                        break;
                    case 2:
                        forum f = new forum();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,f).commit();
                        break;
                    case 3:
                        profiles p = new profiles();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,p).commit();
                        break;
                    case 4 :
                        games g = new games();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,g).commit();
                        break;


                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}