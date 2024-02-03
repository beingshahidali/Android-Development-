package com.example.greeting;

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

      Button button  = findViewById(R.id.mybutton);
      TextView textView = findViewById(R.id.textView);
      EditText editText = findViewById(R.id.editText);


      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String value = editText.getText().toString();
              textView.setText("Hi " +value + "Welcome to the first Application");
          }
      });
    }
}