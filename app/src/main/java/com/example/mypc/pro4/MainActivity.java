package com.example.mypc.pro4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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

    }

    public void SearchScreen(View view){
        Intent intent = new Intent(this, SearchScreen.class);
        startActivity(intent);
    }

    public void SongListScreen(View view){
        Intent intent = new Intent(this, SongsList.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId() == SearchImage.getId() || view.getId() == SearchText.getId())
        {
            SearchScreen(view);
        }
        else if (view.getId() == ListImage.getId() || view.getId() == ListText.getId())
        {
            SongListScreen(view);
        }

    }
}
