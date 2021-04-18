package com.example.famousathletes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    private CardView messi_card,maradona_card,ronaldo_card;
    private ImageView messi_image,maradona_image,ronaldo_image;
    private String aboutMessi, aboutMaradona, aboutRonaldo;
    private HallOfFame hof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hof = new HallOfFame();
        setView();
    }

    private void setView(){
        aboutMessi = hof.getMessiInfo();
        aboutMaradona = hof.getMaradonaInfo();
        aboutRonaldo = hof.getRonaldoInfo();

        messi_card=findViewById(R.id.Messi);
        maradona_card=findViewById(R.id.Maradona);
        ronaldo_card=findViewById(R.id.Ronald);

        messi_image = (ImageView) findViewById(R.id.messiImage);
        maradona_image=(ImageView) findViewById(R.id.maradonaImage);
        ronaldo_image=(ImageView) findViewById(R.id.ronaldoImage);

        messi_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(aboutMessi);
            }
        });

        messi_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getString(R.string.messi), Toast.LENGTH_SHORT).show();
            }
        });

        maradona_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(aboutMaradona);
            }
        });
        maradona_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getString(R.string.diegomaradona), Toast.LENGTH_SHORT).show();
            }
        });

        ronaldo_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo(aboutRonaldo);
            }
        });

        ronaldo_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getString(R.string.ronaldo), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void openInfo(String aboutText){
        Intent intent = new Intent(getBaseContext(), StarsInfoActivity.class);
        intent.putExtra("INFO_TEXT", aboutText);
        startActivity(intent);
    }

}