package com.orange.students.calarasu.marius.oopExercises.exercise02;
/**
 * Creati o clasa care sa contina 3 variabile, din care 2 finale, una fara valoare initiala.
 *     Creati o clasa MainExercisesThreeTwo in care sa creati un obiect al clasei de mai sus
 * si folosind metode "get" sa returnati valorile variabilelor, fara sa fie nevoie de metode "set" pe variabile.
 * */
public class Employee {

    private final String firstName = "Stoica";
    private final String lastName = "Dumitru";
    private int age;

    public Employee(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
