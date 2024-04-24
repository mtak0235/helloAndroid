package com.example.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Class<?>> activityClasses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        activityClasses = new ArrayList<>(Arrays.asList(first.class, second.class, third.class, fourth.class, fifth.class, sixth.class, eighth.class, nineth.class, tenth.class, eleventh.class));
        int END_NUM = activityClasses.size();
        List<Integer> buttonNumbers = IntStream.rangeClosed(1, END_NUM).boxed().collect(Collectors.toList());

        for (Integer i : buttonNumbers) {
            Button button = getButton(i);
            linearLayout.addView(button);
            final int index = i - 1;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, activityClasses.get(index % activityClasses.size()));
                    startActivity(intent);
                }
            });
        }
        setContentView(linearLayout);
    }

    @NonNull
    private Button getButton(int i) {
        Button btn = new Button(this);
        btn.setText(String.valueOf(i));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(0, 16, 0, 16);
        btn.setLayoutParams(params);
        return btn;
    }
}