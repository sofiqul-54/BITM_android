package com.mobileappdevelop.registratrionform;

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

    private EditText firstNameET,lastNameET,emailET,passwordET;
    private AutoCompleteTextView bloodGroupAC;
    private RadioButton maleRB,femaleRB;
    private CheckBox termsAndConditioncheckBox;
    private Button registerButton;
    private TextView signUpTV;

    private  String[] bloodGroup = {"A+","A-","B-","B+","O-","O+","AB+","AB-",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameET = findViewById(R.id.FirstNameId);
        lastNameET = findViewById(R.id.LastNameId);
        emailET = findViewById(R.id.EmailId);
        passwordET = findViewById(R.id.Passwordid);
        bloodGroupAC = findViewById(R.id.AutoCompleteId);
        maleRB = findViewById(R.id.MaleId);
        femaleRB = findViewById(R.id.FemaleId);
        termsAndConditioncheckBox = findViewById(R.id.CheckBoxId);
        registerButton = findViewById(R.id.RegisterButtonId);
        signUpTV = findViewById(R.id.SignUpId);


        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,bloodGroup);

        bloodGroupAC.setAdapter(adapter);
        bloodGroupAC.setThreshold(1);

        termsAndConditioncheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if(checked==true)
                {
                    registerButton.setVisibility(View.VISIBLE);
                }
                else if(checked==false)
                {
                    registerButton.setVisibility(View.GONE);

                }
            }
        });

    }
}
