package com.mobileappdevelop.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNameEt,lastNameEt,emailEt,password;
    private AutoCompleteTextView bloodGroupACTV;
    private CheckBox tandCCB;
    private Button signUpBtn;
    private RadioButton maleRb,femaleRb;
    private TextView signIn;
    private String[] bloodgroup ={"A+","A-","B+","B-","AB+","AB-","O+","O-"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        firstNameEt = findViewById(R.id.firstNameET);
        lastNameEt =findViewById(R.id.lastNameET);
        emailEt=findViewById(R.id.emailET);
        password=findViewById(R.id.passwordET);
        bloodGroupACTV=findViewById(R.id.bloodGroupACTV);
        tandCCB=findViewById(R.id.tAndCCB);
        signUpBtn=findViewById(R.id.signUpBtn);
        maleRb=findViewById(R.id.maleRB);
        femaleRb=findViewById(R.id.femaleRB);
        signIn=findViewById(R.id.signUpBtn);


        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,bloodgroup);
        bloodGroupACTV.setAdapter(adapter);
        bloodGroupACTV.setThreshold(2);

        tandCCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean check) {
                if(check==true){
                    signUpBtn.setVisibility(View.VISIBLE);
                }
                else if(check==false){
                    signUpBtn.setVisibility(View.GONE );
                }
            }
        });

    }
}
