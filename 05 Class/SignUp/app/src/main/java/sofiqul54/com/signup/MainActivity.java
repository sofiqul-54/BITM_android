package sofiqul54.com.signup;

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

    private EditText firstNameET, lastNameET,emailET, passwordET;
    private AutoCompleteTextView bloodGroupACTV;
    private RadioButton maleRb, feMaleRb;
    private CheckBox tncCB;
    private Button signUpBtn;
    private TextView signInTV;

    private String[] bloodGroup = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        firstNameET = findViewById(R.id.firstNameET);
        lastNameET = findViewById(R.id.lastNameET);
        emailET = findViewById(R.id.emailET);
        passwordET = findViewById(R.id.passwordET);
        bloodGroupACTV = findViewById(R.id.bloodGroupACTV);
        maleRb = findViewById(R.id.maleRB);
        feMaleRb=findViewById(R.id.femaleRB);
        tncCB = findViewById(R.id.tncCB);
        signUpBtn = findViewById(R.id.signUpBtn);
        signInTV = findViewById(R.id.signInET);


        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item,bloodGroup);
        bloodGroupACTV.setAdapter(adapter);
        bloodGroupACTV.setThreshold(1); // suggest korbe koyta chr likte hobe;


tncCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
        if(checked==true){
            signUpBtn.setVisibility(View.VISIBLE);

        }else if(checked==false){
            signUpBtn.setVisibility(View.GONE);
        }
    }
});


    }
}
