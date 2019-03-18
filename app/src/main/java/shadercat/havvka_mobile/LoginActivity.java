package shadercat.havvka_mobile;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

//activity for login (sing up, sing in or guest)
//Name of layout: activity_login
public class LoginActivity extends AppCompatActivity {

    Button Sign_in;
    Button Register;
    Button Guest;
    RelativeLayout LoginLayout;
    RelativeLayout SignInUI;
    RelativeLayout LoginUI;
    RelativeLayout RegisterUI;
    ImageView Logo;
    AnimationDrawable Background_Animation;
    boolean IsMainScreen = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //get elements from layout
        Sign_in = (Button) findViewById(R.id.activity_login_sign_in);
        Register = (Button) findViewById(R.id.activity_login_register);
        Guest = (Button) findViewById(R.id.activity_login_guest);
        LoginLayout = (RelativeLayout) findViewById(R.id.activity_login);
        SignInUI = (RelativeLayout) findViewById(R.id.activity_login_sign_in_ui);
        LoginUI = (RelativeLayout) findViewById(R.id.activity_login_ui);
        RegisterUI = (RelativeLayout) findViewById(R.id.activity_login_register_ui);
        Logo = (ImageView) findViewById(R.id.activity_login_logo);

        //set animation for background
        Background_Animation = (AnimationDrawable) LoginLayout.getBackground();
        Background_Animation.setEnterFadeDuration(3000);
        Background_Animation.setExitFadeDuration(3000);
        Background_Animation.start();

        //set animation for logo
        Logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.logo_anim));

        Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for button sign in (when pressed)
                IsMainScreen = false;
                LoginUI.setVisibility(View.INVISIBLE);
                SignInUI.setVisibility(View.VISIBLE);
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for button register (when pressed)
                IsMainScreen = false;
                LoginUI.setVisibility(View.INVISIBLE);
                RegisterUI.setVisibility(View.VISIBLE);
            }
        });

        Guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for button guest (when pressed)
            }
        });
    }
    @Override
    public void onBackPressed() {
        if(IsMainScreen)
        {
            super.onBackPressed();
        }
        else
        {
            IsMainScreen = true;
            LoginUI.setVisibility(View.VISIBLE);
            SignInUI.setVisibility(View.INVISIBLE);
            RegisterUI.setVisibility(View.INVISIBLE);
        }
    }
}
