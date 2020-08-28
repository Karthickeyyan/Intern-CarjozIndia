package com.karthickeyyan.android_internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private CheckedTextView sport;
    private CheckedTextView travel;
    private CheckedTextView retail;
    private CheckedTextView entertain;
    private CheckedTextView food;
    private Button next_btn;
    private Button back_btn;
    private TextView sport_tv,enter_tv,travel_tv,food_tv,retail_tv;
    private ImageView sports,pizza,travels,cart,music;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sport = findViewById(R.id.sport_btn);
        travel = findViewById(R.id.travel_btn);
        food = findViewById(R.id.food_btn);
        entertain = findViewById(R.id.entertainment_btn);
        retail = findViewById(R.id.retail_btn);
        next_btn = findViewById(R.id.next_btn);
        back_btn = findViewById(R.id.back_btn);
        sport_tv=findViewById(R.id.sport_tv);
        travel_tv = findViewById(R.id.travel_tv);
        food_tv = findViewById(R.id.food_tv);
        enter_tv = findViewById(R.id.enter_tv);
        retail_tv = findViewById(R.id.retail_tv);
        sports =findViewById(R.id.sports);
        travels=findViewById(R.id.travels);
        music=findViewById(R.id.music);
        pizza=findViewById(R.id.pizza);
        cart=findViewById(R.id.cart);

        sport.setOnClickListener(new View.OnClickListener()
        {
            Drawable background = sport.getBackground();

            @Override
            public void onClick(View v) {
                if (sport.isChecked())
                {
                    sport.setChecked(false);
                    sport_tv.setTextColor(Color.BLACK);
                    sports.setColorFilter(Color.BLACK);
                }

                else
                {
                    sport.setChecked(true);
                    sport_tv.setTextColor(Color.WHITE);
                    sports.setColorFilter(Color.WHITE);
                }

            }
        });

        retail.setOnClickListener(new View.OnClickListener() {
            Drawable background = retail.getBackground();

            @Override
            public void onClick(View v) {
                if (retail.isChecked())
                {

                    retail.setChecked(false);
                    retail_tv.setTextColor(Color.BLACK);
                    cart.setColorFilter(Color.BLACK);
                }

                else {
                    retail.setChecked(true);
                    retail_tv.setTextColor(Color.WHITE);
                    cart.setColorFilter(Color.WHITE);
                }

            }
        });

        entertain.setOnClickListener(new View.OnClickListener() {
            Drawable background = entertain.getBackground();

            @Override
            public void onClick(View v)
            {
                if (entertain.isChecked()) {

                    entertain.setChecked(false);
                    enter_tv.setTextColor(Color.BLACK);
                    music.setColorFilter(Color.BLACK);

                }

                else
                {
                    entertain.setChecked(true);
                    enter_tv.setTextColor(Color.WHITE);
                    music.setColorFilter(Color.WHITE);
                }

            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            Drawable background = food.getBackground();

            @Override
            public void onClick(View v) {
                if (food.isChecked()) {

                    food.setChecked(false);
                    food_tv.setTextColor(Color.BLACK);
                    pizza.setColorFilter(Color.BLACK);
                }

                else {
                    food.setChecked(true);
                    food_tv.setTextColor(Color.WHITE);
                    pizza.setColorFilter(Color.WHITE);
                }

            }
        });

        travel.setOnClickListener(new View.OnClickListener() {
            Drawable background = travel.getBackground();

            @Override
            public void onClick(View v) {
                if (travel.isChecked()) {

                    travel.setChecked(false);
                    travel_tv.setTextColor(Color.BLACK);
                    travels.setColorFilter(Color.BLACK);
                }

                else{
                    travel.setChecked(true);
                    travel_tv.setTextColor(Color.WHITE);
                    travels.setColorFilter(Color.WHITE);
                }
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScreen();
            }
        });

    }

    private void openScreen()
    {
        Intent intent = new Intent(this,Botton_Nav.class);
        startActivity(intent);
    }

}
