package com.dell.splashscreenanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    Button sub;
    Animation frombottom,fromtop;
    ImageView ballon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sub = (Button)findViewById(R.id.sub);
        ballon = (ImageView)findViewById(R.id.ballon);

        frombottom = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.fromtop);

        sub.setAnimation(frombottom);
        ballon.setAnimation(fromtop);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
