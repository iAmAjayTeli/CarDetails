package com.example.practical14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] cars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        cars = new String[]{"Hatchback", "Sedan", "MPV", "SUV", "Crossover", "Coupe", " Convertible", "Wagon", "Van", "Pickup Truck", "Sports Car",
                "Electric Cars (EVs)", "Hybrid Cars", "Luxury Cars", "Sports Cars", "Supercars", "City Cars", "Van", "Van",};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, cars);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String carName = (String) listView.getItemAtPosition(i);
                if (carName.equals("Hatchback") || carName.equals("Sedan") || carName.equals("MPV") || carName.equals("SUV")
                        || carName.equals("Crossover") || carName.equals("Coupe")) {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("Carname", carName);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, carName + " car details is coming soon", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}