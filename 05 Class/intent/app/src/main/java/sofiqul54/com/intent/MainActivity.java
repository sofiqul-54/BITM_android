package sofiqul54.com.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText phonnoET;
    private Button callBtn;

    private String phonNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phonnoET = findViewById(R.id.phonNoET);
        callBtn = findViewById(R.id.callBtn);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phonNo = phonnoET.getText().toString();

                if (phonnoET.equals("")) {
                    Toast.makeText(MainActivity.this, "Enter any number", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + phonNo));
                    startActivity(intent);
                }
            }
        });
    }
}
