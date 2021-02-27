package com.orange.topics.abstractTopic;

import com.orange.topics.interfaceTopic.interfaces.Animal;

import java.util.ArrayList;
import java.util.List;

public class MainFruitsClass {

    public static void main(String[] args){

        Fruits fruits = new Fruits() {
            @Override
            public void size() {
                System.out.println("fruit size");
            }

            @Override
            public void shape() {
                System.out.println("fruit shape");
            }
        };
        fruits.size();
        fruits.shape();
        fruits.color();
        fruits.taste();

        TropicalFruits mangoFruit = new Mango();
        mangoFruit.isPoisonous();
        System.out.println(mangoFruit.toString());

        int i = IFruit.NUMAR_FRUCTE;

        System.out.println("-----------------------------------------");

        Fruits apple = new Apple();
        apple.color();
        apple.size();
        apple.taste();

        Apple applePolonia = new Apple();
        applePolonia.country();

        System.out.println("-----------------------------------------");

        Ananas ananas = new Ananas();
        ananas.color();
        ananas.size();
        ananas.taste();

        System.out.println("-----------------------------------------");

        Mango mango = new Mango();
        mango.color();
        mango.shape();
        mango.size();
        mango.isPoisonous();

        Banana banana = new Banana();


        System.out.println("----------------");
        List<Fruits> listOfFruits = new ArrayList<>();
        listOfFruits.add(ananas);
        listOfFruits.add(mango);
        listOfFruits.add(apple);

        for(Fruits fruct : listOfFruits ){
            fruct.shape();
        }


    }

}
