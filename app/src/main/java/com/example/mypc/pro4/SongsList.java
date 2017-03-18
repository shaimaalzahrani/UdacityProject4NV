package com.example.mypc.pro4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SongsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);
    }

    public void ToPlaying(View view){
        Intent intent = new Intent(this, NowPlayingScreen.class);
        startActivity(intent);
    }
}
