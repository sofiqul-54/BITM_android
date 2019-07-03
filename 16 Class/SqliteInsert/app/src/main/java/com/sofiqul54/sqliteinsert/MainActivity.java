package com.sofiqul54.sqliteinsert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText nameET, ageET;
private Button insert, viewDetailes;
private String aName, aAge;
private DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                aName = nameET.getText().toString();
                aAge = ageET.getText().toString();

                long id = databaseHelper.insertDate(aName, aAge);

                Toast.makeText(MainActivity.this,"id", Toast.LENGTH_LONG).show();



            }
        });
    }

    private void init() {
        nameET = findViewById(R.id.nameET);
        ageET = findViewById(R.id.ageET);
        insert = findViewById(R.id.insertBtn);
        viewDetailes = findViewById(R.id.viewDetailsBtn);


    }
}
