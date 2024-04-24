package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tenth extends AppCompatActivity {

    private ImageView imageView;
    private Button buttonScale, buttonRotate, buttonAlpha;
    private float scaleFactor = 1.0f;
    private float rotationDegree = 0.0f;
    private float alphaValue = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tenth);

        imageView = findViewById(R.id.imageView);
        buttonScale = findViewById(R.id.buttonScale);
        buttonRotate = findViewById(R.id.buttonRotate);
        buttonAlpha = findViewById(R.id.buttonAlpha);
        buttonScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scaleFactor += 0.1f;
                imageView.setScaleX(scaleFactor);
                imageView.setScaleY(scaleFactor);
            }
        });

        buttonRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotationDegree += 45.0f;
                imageView.setRotation(rotationDegree);
            }
        });
        buttonAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alphaValue -= 0.1f;
                if (alphaValue < 0.0f) {
                    alphaValue = 1.0f;
                }
                imageView.setAlpha(alphaValue);
            }
        });
    }
}