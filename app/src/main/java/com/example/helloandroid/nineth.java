package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class nineth extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nineth);
        layout = (LinearLayout) findViewById(R.id.nineth_main);
    }

    public void onClick(View view) {
        int id = view.getId();
        int a = Integer.parseInt(((EditText) findViewById(R.id.first_value)).getText().toString());
        int b = Integer.parseInt(((EditText) findViewById(R.id.second_value)).getText().toString());
        TextView textView = new TextView(nineth.this);

        if (id == R.id.p) {
            textView.setText(String.valueOf(a + b));
        } else if (id == R.id.m) {
            textView.setText(String.valueOf(a - b));
        } else if (id == R.id.d) {
            textView.setText(String.valueOf((double) a / b));
        } else if (id == R.id.c) {
            textView.setText(String.valueOf(a * b));
        }
        layout.addView(textView);
    }
}