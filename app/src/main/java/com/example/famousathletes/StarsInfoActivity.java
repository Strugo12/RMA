package com.example.famousathletes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class StarsInfoActivity extends AppCompatActivity {

    private TextView tvAbout;
    private ImageView ivAbout;
    Intent intent;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stars_info);
        intent = (Intent) getIntent();
        text = intent.getStringExtra("INFO_TEXT");
        setView();

    }

    private void setView() {
        tvAbout = (TextView) findViewById(R.id.aboutText);
        ivAbout = (ImageView) findViewById(R.id.aboutImage);
        tvAbout.setText(text);

    }

}