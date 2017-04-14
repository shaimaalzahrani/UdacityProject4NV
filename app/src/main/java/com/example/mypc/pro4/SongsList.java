package com.example.mypc.pro4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SongsList extends AppCompatActivity implements View.OnClickListener{

    ImageView Cover;
    TextView Name;
    TextView Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);
        Cover = (ImageView) findViewById(R.id.Song1);
        Name = (TextView) findViewById(R.id.Song1Name);
        Title = (TextView) findViewById(R.id.Song1Title);

    }

    public void ToPlaying(View view){
        Intent intent = new Intent(this, NowPlayingScreen.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view){

        if(view == Cover || view == Name || view == Title){
            ToPlaying(view);
        }
    }
}
