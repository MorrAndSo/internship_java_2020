package com.orange.topics.inheritanceTopic;

public class Vehicle {

    protected String brand = "Ford";        // Vehicle attribute
    protected String color;

    public Vehicle(){
        this.color = "red";
    }

    public Vehicle (String color){
        this.color = color;
    }

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");

    }

    public String getBrand() {
        return brand;
    }

    public void breakSound() {
        System.out.println("SSSSSSSS!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

