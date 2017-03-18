package com.example.mypc.pro4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NowPlayingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing_screen);
    }

    public void ChangeToPause(View view){
        if (Integer.parseInt(view.getTag().toString()) == 1) {
            view.setBackgroundResource(R.drawable.pause);
            view.setTag(2);
        } else {
            view.setBackgroundResource(R.drawable.play);
            view.setTag(1);
        }
    }
}
