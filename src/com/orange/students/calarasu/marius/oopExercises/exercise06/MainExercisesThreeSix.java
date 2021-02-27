package com.orange.students.calarasu.marius.oopExercises.exercise06;

public class MainExercisesThreeSix {
    public static void main(String[] args) {

        Lion animal = new Lion("Lion");

        int lionsNumberOfEyes = Lion.numberOfEyes;
        int lionsNUmberOFLegs = Lion.numberOfLegs;

        System.out.println(animal.getBreed() + " has " + lionsNumberOfEyes + " eyes and " + lionsNUmberOFLegs + " legs");
        animal.attacks();
        animal.hunts();

    }
}
