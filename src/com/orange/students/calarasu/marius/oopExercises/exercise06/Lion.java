package com.orange.students.calarasu.marius.oopExercises.exercise06;

public class Lion extends Animal implements Wild {

    public Lion(String bread) {
        super(bread);
    }

    @Override
    public void hunts() {
        System.out.println("The Lion hunts");
    }

    @Override
    public void attacks() {
        System.out.println("The Lion attacks if is in danger");
    }

}
