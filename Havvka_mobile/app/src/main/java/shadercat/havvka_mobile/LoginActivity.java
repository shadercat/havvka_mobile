package shadercat.havvka_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//activity for login (sing up, sing in or guest)
//Name of layout: activity_login
public class LoginActivity extends AppCompatActivity {

    Button Sign_in = (Button) findViewById(R.id.activity_login_sign_in);
    Button Register = (Button) findViewById(R.id.activity_login_register);
    Button Guest = (Button) findViewById(R.id.activity_login_guest);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for button sign in (when pressed)
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for button register (when pressed)
            }
        });

        Guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for button guest (when pressed)
            }
        });
    }
}
