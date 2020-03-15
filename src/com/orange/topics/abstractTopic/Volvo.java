package com.orange.topics.abstractTopic;

public class Volvo extends Car {

    @Override
    public String getMarca() {
        return "Volvo";
    }

    @Override
    public String toString() {
        return getMarca().concat(", ").concat(super.toString());
    }
}
