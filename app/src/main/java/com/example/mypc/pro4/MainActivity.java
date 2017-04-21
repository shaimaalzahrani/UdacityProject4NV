package com.example.mypc.pro4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    ImageView SearchImage;
    ImageView ListImage;
    TextView SearchText;
    TextView ListText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SearchImage = (ImageView)findViewById(R.id.List);
        SearchText = (TextView)findViewById(R.id.List2);
        ListImage = (ImageView)findViewById(R.id.Search);
        ListText = (TextView)findViewById(R.id.Search2);


        SearchImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SearchScreen(v);
            }
        });

        SearchText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SearchScreen(v);
            }
        });

        ListImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SongListScreen(v);
            }
        });

        ListText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SongListScreen(v);
            }
        });
    }

    public void SearchScreen(View view){
        Intent intent = new Intent(this, SearchScreen.class);
        startActivity(intent);
    }

    public void SongListScreen(View view){
        Intent intent = new Intent(this, SongsList.class);
        startActivity(intent);
    }

}
