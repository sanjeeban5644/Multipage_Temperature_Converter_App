package com.example.temperatureconverternew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button fartocelbutton;
    private Button celtofarbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celtofarbutton = findViewById(R.id.celtofarbutton);
        fartocelbutton = findViewById(R.id.fartocelbutton);
        celtofarbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "Opening New Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,CeltoFar.class);
                startActivity(intent);
            }

        });
        fartocelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening New Page", Toast.LENGTH_SHORT).show();
                Intent pot = new Intent(MainActivity.this,FartoCel.class);
                startActivity(pot);
            }
        });

    }



}