package com.orange.students.calarasu.marius.week.five.inplementation;

import com.orange.students.calarasu.marius.week.five.interfaces.*;

public class Porc implements Terestru, Domestic {

    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void merge() {
        System.out.println(nume + " merge in patru picioare");
    }

    @Override
    public void sunet() {
        System.out.println(nume + " guita");
    }

    @Override
    public void mananca() {
        System.out.println(nume + " mananca gaunte");
    }

    @Override
    public void utilitate() {
        System.out.println("Pentru carne");
    }

    public String toString() {
        return String.format("Porc");
    }
}
