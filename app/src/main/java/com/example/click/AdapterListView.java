package com.example.click;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.click.controller.FruitController;
import com.example.click.model.Fruit;

import java.util.Arrays;
import java.util.List;

public class AdapterListView extends AppCompatActivity {

    FruitController fruitController;
    ListView listView;
    List<Fruit> listFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_list_view);

        listView = findViewById(R.id.listView);

        fruitController = new FruitController();
        listFruits = Arrays.asList(fruitController.getFruits());

        ShowFruitAdapter fruitAdapterListView = new ShowFruitAdapter(getApplicationContext(), R.layout.template_item_fruit, listFruits);

        listView.setAdapter(fruitAdapterListView);
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(getApplicationContext(), ShowFruit.class);
            intent.putExtra("id",i);
            startActivity(intent);
        });
    }
}