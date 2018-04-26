package com.cpe.neramit;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HowToPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_how_to_play);

        final ImageButton big_image = (ImageButton) findViewById(R.id.big) ;
        final ImageButton small_image = (ImageButton)findViewById(R.id.small) ;

        small_image.setVisibility(View.VISIBLE);
        big_image.setVisibility(View.GONE);

        small_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                small_image.setVisibility(View.GONE);
                big_image.setVisibility(View.VISIBLE);
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
        });

        big_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                small_image.setVisibility(View.VISIBLE);
                big_image.setVisibility(View.GONE);
            }
        });


        Button go_camera = (Button)findViewById(R.id.to_camera);
        go_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x =new Intent(getApplicationContext(),UnityPlayerNativeActivity.class) ;
                startActivity(x);
            }
        });



    }
}
