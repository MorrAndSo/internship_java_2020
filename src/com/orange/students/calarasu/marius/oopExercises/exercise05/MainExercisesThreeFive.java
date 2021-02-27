package com.orange.students.calarasu.marius.oopExercises.exercise05;

public class MainExercisesThreeFive {
    public static void main(String[] args) {

        Cereals cereals = new Barley();
        cereals.grows();
        cereals.sprouts();
        Barley barley = new Barley();
        barley.grows();
        barley.sprouts();

        Cereals cereals1 = new Wheat();
        cereals1.sprouts();
        cereals1.grows();
        Wheat wheat = new Wheat();
        wheat.grows();
        wheat.sprouts();

    }
}
