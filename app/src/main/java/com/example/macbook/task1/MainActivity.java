package com.example.macbook.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageOne;
    private ImageView imageTwo;
    private ImageView imageThree;
    private ImageView imageFour;
    private ImageView imageFive;
    private ImageView imageSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageOne = findViewById(R.id.image1);
        imageOne.setOnClickListener(this);
        imageTwo = findViewById(R.id.image2);
        imageTwo.setOnClickListener(this);
        imageThree = findViewById(R.id.image3);
        imageThree.setOnClickListener(this);
        imageFour = findViewById(R.id.image4);
        imageFour.setOnClickListener(this);
        imageFive = findViewById(R.id.image5);
        imageFive.setOnClickListener(this);
        imageSix = findViewById(R.id.image6);
        imageSix.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {


    }
}
