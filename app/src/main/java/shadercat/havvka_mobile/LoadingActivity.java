package shadercat.havvka_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LoadingActivity extends AppCompatActivity {

    ImageView ImageCrutch;
    ImageView ImageCrutch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        ImageCrutch = (ImageView) findViewById(R.id.loading_activity_crutch);
        ImageCrutch2 = (ImageView) findViewById(R.id.loading_activity_crutch2);


        Animation anim = AnimationUtils.loadAnimation(this, R.anim.loading_screen_anim);
        Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.loading_screen_anim2);
        ImageCrutch.startAnimation(anim);
        ImageCrutch2.startAnimation(anim2);

    }
}
