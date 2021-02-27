package com.orange.topics.inheritanceTopic;

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
}
