package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybtn= findViewById(R.id.mybtn);
        TextView title = findViewById(R.id.textView);
        TextView weight = findViewById(R.id.textView2);
        EditText editText = findViewById(R.id.editText);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = (Integer.parseInt(editText.getText().toString()));
                double finalAns = value*2.20;

                title.setText("Your weight is ");
                weight.setText(String.format("%.2f", finalAns));



            }
        });
    }
}