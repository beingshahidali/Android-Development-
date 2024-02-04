package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class output extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        TextView title = findViewById(R.id.textView2);
        TextView randomNumber = findViewById(R.id.textView3);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("name");
        title.setText(userName +" your lucky number is ");

        Random random = new Random();
        int randomValue = random.nextInt(100);
        randomNumber.setText(Integer.toString(randomValue));



    }

}