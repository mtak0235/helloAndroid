package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class eighth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eighth);
        LinearLayout layout = (LinearLayout) findViewById(R.id.eighth_main);
        Button button = (Button) findViewById(R.id.btn);
        Random random = new Random();
        int randomN = random.nextInt(10) + 1;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.number);
                int userN = Integer.parseInt(editText.getText().toString());
                TextView textView = new TextView(eighth.this);
                if (userN == randomN)
                    textView.setText("정답이오");
                else if (userN > randomN) {
                    textView.setText("down");
                } else {
                    textView.setText("up");
                }

                layout.addView(textView);
            }
        });
    }
}