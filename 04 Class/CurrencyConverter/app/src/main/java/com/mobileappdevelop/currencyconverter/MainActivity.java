package com.mobileappdevelop.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        EditText inputET = findViewById(R.id.inputET);
        RadioButton dollaerToBdt = findViewById(R.id.dollerToBdtRB);
        RadioButton bdtToDollar = findViewById(R.id.bdtToDollerRB);
        Button converytBtn = findViewById(R.id.convertBtn);
        final TextView resultET = findViewById(R.id.resultTV);

        converytBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Currency Convert", Toast.LENGTH_LONG).show();
            }
        });





    }
}
