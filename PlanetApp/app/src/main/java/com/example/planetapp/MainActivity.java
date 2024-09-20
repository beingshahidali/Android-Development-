package com.example.planetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Currency;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Planet> planetArrayList;
    private  static MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        planetArrayList = new ArrayList<>();

        planetArrayList.add(new Planet("Earth", "1", R.drawable.earth));
        planetArrayList.add(new Planet("Earth", "1", R.drawable.earth));
        planetArrayList.add(new Planet("Earth", "1", R.drawable.earth));
        planetArrayList.add(new Planet("Earth", "1", R.drawable.earth));

        adapter = new MyCustomAdapter(planetArrayList,getApplicationContext());

        listView.setAdapter(adapter);

    }
}