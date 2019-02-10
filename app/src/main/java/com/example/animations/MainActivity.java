package com.example.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(){
        Log.i("Info", "Image pressed");

        ImageView image = (ImageView) findViewById(R.id.ivImage);
        ImageView image2 = (ImageView) findViewById(R.id.ivImage2);

        image.animate().alpha(0).setDuration(2000);
        image2.animate().alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
