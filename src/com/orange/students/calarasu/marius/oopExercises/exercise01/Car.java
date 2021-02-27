package com.orange.students.calarasu.marius.oopExercises.exercise01;
/**
 * 1)  Creati o clasa care sa contina 3 variabile de tipuri diferite si aplicati conceptul de encapsulare.
 *     Creati o clasa MainExercisesThreeOne in care sa creati un obiect al clasei mai sus create si valorizati cele 3 variabile,
 * apoi returnati valorire atribuite mai devreme.
 * */
public class Car {

    private String mark;
    private String model;
    private  String color;

    public Car(String mark, String model, String color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public String getMark(){
        return this.mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'';
    }
}
