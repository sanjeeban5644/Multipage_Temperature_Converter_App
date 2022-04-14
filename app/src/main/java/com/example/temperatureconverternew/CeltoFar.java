package com.example.temperatureconverternew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CeltoFar extends AppCompatActivity {
        EditText celtofardata;
        Button button;
        TextView celtofaroutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celto_far);
        celtofardata = findViewById(R.id.celtofardata);
        button = findViewById(R.id.button);
        celtofaroutput = findViewById(R.id.celtofaroutput);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CeltoFar.this, "Temperature Converted", Toast.LENGTH_SHORT).show();
                String data = celtofardata.getText().toString();
                float cel = Float.parseFloat(data);
                float far = (float)((cel*1.8)+32);
                celtofaroutput.setText("The Temperature in Farenheit is : "+far);
            }
        });
    }

}