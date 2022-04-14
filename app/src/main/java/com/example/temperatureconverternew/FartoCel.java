package com.example.temperatureconverternew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FartoCel extends AppCompatActivity {
    Button button2;
     EditText fartoceldata;
    TextView fartoceloutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farto_cel);
        button2=findViewById(R.id.button2);
        fartoceldata=findViewById(R.id.fartoceldata);
        fartoceloutput = findViewById(R.id.fartoceloutput);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FartoCel.this, "Temperature Converted", Toast.LENGTH_SHORT).show();
                String data = fartoceldata.getText().toString();
                float far = Float.parseFloat(data);
                float cel = (float)(((far-32)/9)*5);
                fartoceloutput.setText("The Temperature in Celcius is : "+cel);
            }
        });

    }
}