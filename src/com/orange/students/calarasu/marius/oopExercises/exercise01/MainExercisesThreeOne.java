package com.orange.students.calarasu.marius.oopExercises.exercise01;

public class MainExercisesThreeOne {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMark("Dacia");
        car.setModel("Logan");
        car.setColor("White");

        System.out.println(car.getMark() + " " + car.getModel() + " " + car.getColor());


        Car carTwo = new Car("Fiat", "Panda", "Black");

        System.out.println(car.toString());
    }
}
