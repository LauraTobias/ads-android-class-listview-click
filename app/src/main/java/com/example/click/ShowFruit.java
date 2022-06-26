package com.example.click;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.click.controller.FruitController;
import com.example.click.model.Fruit;

public class ShowFruit extends AppCompatActivity {

    Fruit fruit;
    TextView txtFruitName;
    ImageView imgFruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_fruit);

        int id = getIntent().getExtras().getInt("id");

        txtFruitName =findViewById(R.id.txtName);
        imgFruit = findViewById(R.id.imageView);

        FruitController fruitController = new FruitController();
        txtFruitName.setText(fruitController.getFruits()[id].getName());
        imgFruit.setImageResource(fruitController.getFruits()[id].getImage());
    }
}