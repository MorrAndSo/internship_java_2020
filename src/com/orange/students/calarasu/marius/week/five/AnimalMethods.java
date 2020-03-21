package com.orange.students.calarasu.marius.week.five;


import com.orange.students.calarasu.marius.week.five.interfaces.*;

import java.util.ArrayList;

public class AnimalMethods {
    public static void isInstanceOfAnimal(ArrayList<Animal> animals) {

        for (Animal i : animals){
            if(i instanceof Animal) {
                System.out.println(i + " is an instance of Animal");
            }else System.out.println(i + " is not an instance of Animal");
        }
    }

    public static void isDomesticOrSalbatic(ArrayList<Animal> animals) {

        for (Animal i : animals){
            if(i instanceof Domestic) {
                System.out.println(i + " is domestic");
            }else System.out.println(i + " is salbatic");
        }
    }


    public static void modDeplasare(ArrayList<Animal> animals) {

        for (Animal i : animals){
            if(i instanceof Acvatic && i instanceof Terestru){
                System.out.println(i + " inoata si merge");
            }else if(i instanceof Aerian && i instanceof Terestru){
                System.out.println(i + " merge si zboara");
            }else  if(i instanceof Acvatic && i instanceof Aerian){
                System.out.println(i + " zboara si inoata");
            } else if(i instanceof Aerian) {
                System.out.println(i + "ul zoboara");
            }else if(i instanceof Acvatic) {
                System.out.println(i + "ul inoata");
            }else if(i instanceof Terestru) {
                System.out.println(i + "ul merge");
            }
        }
    }



    public static void  getAnimals (ArrayList<Animal>animals){
        for (int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }
    }
}
