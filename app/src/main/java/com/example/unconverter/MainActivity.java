package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button SubmitButton = findViewById(R.id.button);
         TextView inputNumber = findViewById(R.id.inputeditTextNumber);
        TextView output = findViewById(R.id.output);

        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "hello world", Toast.LENGTH_SHORT).show();

                String inp = inputNumber.getText().toString();
                int kg = Integer.parseInt(inp); // convertes it into integer

                double pound = kg * 2.205;

                output.setText("the value in pounds is "+ pound);



            }
        });



    }
}