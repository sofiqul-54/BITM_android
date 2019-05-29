package sofiqul54.com.button;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private  EditText editText;
   private Button button;
   private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.EditTextid);
        button= findViewById(R.id.ButtonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = editText.getText().toString();

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);


                intent.putExtra("key",value);
                startActivity(intent);


            }
        });



    }
}
