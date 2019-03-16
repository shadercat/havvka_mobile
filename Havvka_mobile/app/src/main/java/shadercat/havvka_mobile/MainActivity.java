package shadercat.havvka_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//this class is entry point for application.
public class MainActivity extends AppCompatActivity {

    final int REQUEST_SUCCESS = 1;
    final int REQUEST_FAILED = 0;
    public boolean Is_login = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
