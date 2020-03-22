package com.orange.students.calarasu.marius.week.five;


import com.orange.students.calarasu.marius.week.five.interfaces.*;
import com.orange.students.calarasu.marius.week.five.inplementation.*;

import java.util.ArrayList;

import static com.orange.students.calarasu.marius.week.five.AnimalMethods.*;

public class AnimalsMainClass {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Porc porkyPig = new Porc();
        Gaina chick = new Gaina();
        Vultur hawk = new Vultur();
        Crocodil croco = new Crocodil();

        animals.add(porkyPig);
        animals.add(chick);
        animals.add(hawk);
        animals.add(croco);

        System.out.println("---- Print Animals using 'for loop' ----");
        getAnimals(animals);
        System.out.println();

        System.out.println("---- Verify if the object is  a instance of 'Animal' ---- " + "\n");
        isInstanceOfAnimal(animals);
        System.out.println();

        System.out.println("---- Verify if the object is  a instance of 'Domnestic' ---- " + "\n");
        isDomesticOrSalbatic(animals);
        System.out.println();

        System.out.println("---- Verify if the object is  a instance of 'Terestru, Acvatic or Aerian' ----" + "\n");
        modDeplasare(animals);
        System.out.println();



        // Setting names to Animal objects
        chick.setNume("Twity");
        hawk.setNume("Hawk");
        croco.setNume("Croco");
        porkyPig.setNume("Porky");

        System.out.println("---- Calling somme Methods of Pig object ----" + "\n");
        porkyPig.mananca();
        porkyPig.sunet();
        porkyPig.utilitate();
        porkyPig.merge();

        System.out.println();

        System.out.println("----- ArrayList ------ ");

        ArrayList arrayList = AnimalList.getAnimal();
        AnimalList.iterateWithForLoop(arrayList);
    }
}
