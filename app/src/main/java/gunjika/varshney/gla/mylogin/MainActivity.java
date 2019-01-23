package gunjika.varshney.gla.mylogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText etemail, etpassword;
    TextView result;
    int count=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        etemail=findViewById(R.id.et_email);
        etpassword=findViewById(R.id.et_password);
        result.setText("no of attempts: 3");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(etemail.getText().toString(),etpassword.getText().toString());
            }
        });
    }
    void validate(String email,String password){
        if (email.equals("gunjika.gla_mca17@gla.ac.in")&&password.equals("1234")){
            result.setText("login successful");
        }
        else
        {
            count--;
            result.setText("no of attempts:"+ String.valueOf(count));
            if(count==0)
            {
                button.setEnabled(false);
            }
        }
    }
}
