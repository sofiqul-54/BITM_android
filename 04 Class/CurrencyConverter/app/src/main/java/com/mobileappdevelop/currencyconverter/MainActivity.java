package com.mobileappdevelop.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputET = findViewById(R.id.inputET);
        final RadioButton dollaerToBdt = findViewById(R.id.dollerToBdtRB);
        final RadioButton bdtToDollar = findViewById(R.id.bdtToDollerRB);
        Button converytBtn = findViewById(R.id.convertBtn);
        final TextView resultET = findViewById(R.id.resultTV);
        Button resetButton = findViewById(R.id.resetButtonId);

        converytBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = inputET.getText().toString();


                if (amount.equals("")) {
                    Toast.makeText(MainActivity.this, "Please Enter A Number", Toast.LENGTH_LONG).show();
                } else {
                    if (dollaerToBdt.isChecked()) {
                        double result = Double.valueOf(amount) * 84.94;

                        resultET.setText(String.valueOf(result));
                    } else if (bdtToDollar.isChecked()) {
                        double result = Double.valueOf(amount) / 84.94;

                        resultET.setText(String.valueOf(result));
                    }

                }

            }

        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputET.setText("");
                resultET.setText("0.0");
            }
        });
    }
}






