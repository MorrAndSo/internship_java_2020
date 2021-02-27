package com.orange.students.calarasu.marius.oopExercises.exercise04;
/**
 * Creati o clasa in care sa aveti 2 metode si o variabila.
 *     Creati o a doua clasa care sa mosteneasca pe prima si care sa modifice comportamentul unei metode.
 *     Creati o clasa MainExercisesThreeFour in care sa verificati ca a fost modificat cu succes comportamentul metodei.
 * */
public class Animal {

    protected String breed;

    public Animal(String breed) {
        this.breed = breed;
    }

    public String animalSound(){
        return "the animal makes a sound";
    }

    public String animalMove(){
        return "walks";
    }
}
