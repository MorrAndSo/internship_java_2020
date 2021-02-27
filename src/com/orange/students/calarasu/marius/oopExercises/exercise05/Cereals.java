package com.orange.students.calarasu.marius.oopExercises.exercise05;
/**
 * Creati o clasa in care sa aveti cel putin o metoda abstracta si una non-abstracta si una sau mai multe clase care sa o extinda.
 * Creati o clasa MainExercisesThreeFive in care sa creati sa folositi clasele de mai sus, sa creati atat obiecte copil,
 * dar si un obiect parinte pe care sa-l implementati la nivel de executie a metodei.
 * */
public abstract class Cereals {

    public abstract void grows();

    public void sprouts(){
        System.out.println("Sprouts");
    }

}
