package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


        String[] countries= {"India", "Nepal", "USA"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
          this, android.R.layout.simple_list_item_1, countries
        );
        listView.setAdapter(adapter);
    }
}