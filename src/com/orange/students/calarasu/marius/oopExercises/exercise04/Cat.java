package com.orange.students.calarasu.marius.oopExercises.exercise04;

public class Cat extends Animal {
    private String breed;

    public Cat(String breed) {
        super(breed);
    }


    public String animalSound() {
        return "the cat meows";
    }

    public String animalMove() {
        return "walks";
    }
}
