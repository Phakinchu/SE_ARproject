package com.cpe.neramit;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Surface;
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

        final ImageButton step1 = (ImageButton) findViewById(R.id.rotate) ;
        final ImageButton step2 = (ImageButton) findViewById(R.id.step2) ;
        final ImageButton step3 = (ImageButton) findViewById(R.id.step3) ;
        final Button tocamera = (Button) findViewById(R.id.to_camera) ;


//        final ImageButton small_image = (ImageButton)findViewById(R.id.small) ;

//        small_image.setVisibility(View.VISIBLE);
        step1.setVisibility(View.VISIBLE);
        step2.setVisibility(View.GONE);
        step3.setVisibility(View.GONE);
        tocamera.setVisibility(View.GONE);
        if(getResources().getConfiguration().orientation==2){
            step1.setVisibility(View.GONE);
            step2.setVisibility(View.VISIBLE);
            step2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    step2.setVisibility(View.GONE);
                    step3.setVisibility(View.VISIBLE);
                }
            });
            step3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent x =new Intent(getApplicationContext(),UnityPlayerNativeActivity.class) ;
                    startActivity(x);
                }
            });

        }

//        small_image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                small_image.setVisibility(View.GONE);
//                step1.setVisibility(View.VISIBLE);
//                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//            }
//        });

//        step1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                x = 1 ;
//                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//                if(x == 1) {
//                    step1.setVisibility(View.GONE);
//                }
//
//            }
//        });


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
