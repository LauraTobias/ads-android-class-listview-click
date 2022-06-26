package com.example.click.controller;

import com.example.click.model.Fruit;
import com.example.click.model.Fruits;

import java.util.ArrayList;

public class FruitController {

    Fruits fruitsPersistence ;

    public FruitController() {
        fruitsPersistence = new Fruits();
    }

    public Fruit[] getFruits() {
        return fruitsPersistence.FRUITS;
    }

    public ArrayList<String> getFruitsNames(){
        ArrayList<String> fruitsNames = new ArrayList<String>();

        for (Fruit fruit : this.getFruits()) {
            fruitsNames.add(fruit.getName());
        }

        return fruitsNames;
    }
}
