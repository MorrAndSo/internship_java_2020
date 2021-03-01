package com.orange.topics.inheritanceTopic;

import java.util.Objects;

public class Car extends Vehicle {

    public String modelName = "Mustang";    // Car attribute
    private String color = "pink";

    public Car() {
        super("blue");
    }

    public Car (String color){
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelName.equals(car.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, color);
    }
}
