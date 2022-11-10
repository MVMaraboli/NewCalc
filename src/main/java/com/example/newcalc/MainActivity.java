package com.example.newcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editext1 = findViewById(R.id.editTextA);
        EditText editext2 =findViewById(R.id.editTextB);
        TextView textView = findViewById(R.id.Etiqueta1);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editext1.getText().toString();

                String num2 = editext2.getText().toString();
                int xResultado = Integer.parseInt(num1) + Integer.parseInt(num2);
                textView.setText("El resultado es : "+xResultado);
                editext1.setText("");
                editext2.setText("");
                editext2.clearFocus();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editext1.getText().toString();

                String num2 = editext2.getText().toString();
                int xResultado = Integer.parseInt(num1) - Integer.parseInt(num2);
                textView.setText("El resultado es : "+xResultado);
                editext1.setText("");
                editext2.setText("");
                editext2.clearFocus();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editext1.getText().toString();

                String num2 = editext2.getText().toString();
                int xResultado = Integer.parseInt(num1) * Integer.parseInt(num2);
                textView.setText("El resultado es : "+xResultado);
                editext1.setText("");
                editext2.setText("");
                editext2.clearFocus();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editext1.getText().toString();

                String num2 = editext2.getText().toString();
                int xResultado = Integer.parseInt(num1) / Integer.parseInt(num2);
                textView.setText("El resultado es : "+xResultado);
                editext1.setText("");
                editext2.setText("");
                editext2.clearFocus();
            }
        });
    }
}