package com.orange.topics.inheritanceTopic;

public class Train extends Vehicle {

    public String brand = "GM";
    public String modelName = "1.3";

    @Override
    public void honk() {                    // Vehicle method
        System.out.println("Tiiii, Tuuuuu!");
    }

    @Override
    public void breakSound() {
        super.breakSound();
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return "black";
    }



}
