package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    public void goToSecond(){
        Intent intent = new Intent(this, second.class);
        startActivity(intent);
    }
    public void goToGoogle(){
        Uri link = Uri.parse("https://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, link);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate called",Toast.LENGTH_SHORT).show();
        Button btn = findViewById(R.id.mybtn);
        Button google = findViewById(R.id.mybtn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    goToSecond();
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToGoogle();
            }
        });

       }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy called",Toast.LENGTH_SHORT).show();

    }




}