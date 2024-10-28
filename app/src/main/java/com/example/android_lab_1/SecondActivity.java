package com.example.android_lab_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent data = getIntent();
        String greeting = data.getStringExtra("message");
        TextView textView = findViewById(R.id.greeting);
        textView.setText(greeting);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent();
                EditText editText = findViewById(R.id.name);
                result.putExtra("message", greeting + ", " + editText.getText().toString() + "!");
                setResult(Activity.RESULT_OK, result);
                finish();
            }
        });
    }
}