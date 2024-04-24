package com.example.helloandroid;

import static com.example.helloandroid.R.id.*;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class sixth extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sixth);
    }

    public void onClick(View view) {
        ImageView highImg = (ImageView) findViewById(R.id.high_img);
        ImageView midImg = (ImageView) findViewById(R.id.mid_img);
        ImageView lowImg = (ImageView) findViewById(R.id.low_img);
        highImg.setVisibility(View.INVISIBLE);
        midImg.setVisibility(View.INVISIBLE);
        lowImg.setVisibility(View.INVISIBLE);
        if (view.getId() == R.id.high)
            highImg.setVisibility(View.VISIBLE);
        else if (view.getId() == R.id.mid)
            midImg.setVisibility(View.VISIBLE);
        else
            lowImg.setVisibility(View.VISIBLE);
    }

}