package com.example.practical14;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    ImageView carImg;
    TextView carName, manufacturer, price, description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        carImg = findViewById(R.id.carImg);
        carName = findViewById(R.id.nameOfCar);
        manufacturer = findViewById(R.id.manufacturer);
        price = findViewById(R.id.price);
        description = findViewById(R.id.discription);

        Intent intent = getIntent();
        String nameOfCar = intent.getStringExtra("Carname");


        assert nameOfCar != null;
        if (nameOfCar.equals("Hatchback")) {
            DetailsAdder(R.drawable.hatchback, nameOfCar, R.string.Hatchback_manufacturer, R.string.Hatchback_price, R.string.Hatchback_description);
        } else if (nameOfCar.equals("Sedan")) {
            DetailsAdder(R.drawable.sedan, nameOfCar, R.string.sedan_manu, R.string.sedan_price, R.string.sedan_des);
        } else if (nameOfCar.equals("MPV")) {
            DetailsAdder(R.drawable.mpv, nameOfCar, R.string.mvp_manu, R.string.mvp_price, R.string.mvp_desc);
        } else if (nameOfCar.equals("SUV")) {
            DetailsAdder(R.drawable.suv, nameOfCar, R.string.suv_manu, R.string.suv_price, R.string.suv_desc);
        } else if (nameOfCar.equals("Crossover")) {
            DetailsAdder(R.drawable.crossover, nameOfCar, R.string.crossover_manu, R.string.crossover_price, R.string.crossover_desc);
        } else if (nameOfCar.equals("Coupe")) {
            DetailsAdder(R.drawable.coupe, nameOfCar, R.string.coupe_manu, R.string.coupe_price, R.string.coupe_desc);
        }


    }

    public void DetailsAdder(int img, String CarName, int manu, int money, int desc) {
        carImg.setImageResource(img);
        carName.setText(CarName);
        manufacturer.setText(manu);
        price.setText(money);
        description.setText(desc);
    }

}