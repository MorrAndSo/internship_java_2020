package com.orange.topics.encapsulation;

public class SimpleEncapsulationMainClass {

    public static void main(String args[]) {
        SimpleEncapsulationClass simpleClass = new SimpleEncapsulationClass();

        System.out.println(simpleClass.getMyInt());
        simpleClass.setMyInt(9);
        System.out.println(simpleClass.getMyInt());

        simpleClass.setMyDouble(new Double(8.9d));
        System.out.println(simpleClass.getMyDouble());
    }
}
