package com.orange.topics.abstractTopic;

public class Audi extends Car {

    private String model;

    public Audi() {
    }

    public Audi(String culoare, Integer nrRoti, Boolean isDiesel) {
        super(culoare, nrRoti, isDiesel);
    }

    public Audi(String culoare, Integer nrRoti, Boolean isDiesel, String model) {
        super(culoare, nrRoti, isDiesel);
        this.model = model;
    }

    @Override
    public String getMarca() {
        return "Audi";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return getMarca().concat(", ").concat(getModel()).concat(", ").concat(super.toString());
    }
}
