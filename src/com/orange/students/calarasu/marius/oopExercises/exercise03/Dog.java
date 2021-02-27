package com.orange.students.calarasu.marius.oopExercises.exercise03;
/**
 *  Creati o clasa in care sa faceti override si overload la metoda toString() din Object.
 *     Creati o clasa MainExercisesThreeThree in care sa creati un obiect all clasei de mai sus
 * si apelati noile metode toString create, ata cea overrided cat si 2 versiuni de overloaded.
 * */
public class Dog {
    private String breed;
    private String name;
    private int age;

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
       return breed + " " + name + " " + age;
    }


    public String toString(String owner){
        return owner + " has a " + breed + " named " + name + " who is " + age + " years old";
    }
}
