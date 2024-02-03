package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button mybtn = findViewById(R.id.button);

        mybtn.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            public void onClick(View view) {
                count+=1;
                textView.setText(count);
                Toast.makeText(MainActivity.this, count, Toast.LENGTH_SHORT).show();

            }
        });







    }
}