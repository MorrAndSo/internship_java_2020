package com.orange.students.calarasu.marius.week.five.inplementation;

import com.orange.students.calarasu.marius.week.five.interfaces.*;

public class Gaina implements Domestic, Aerian, Terestru {
    private String nume;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void zboara() {
        System.out.println(nume + " poate zbura un metru");
    }

    @Override
    public void merge() {
        System.out.println(nume + " merge in doua picioare");
    }

    @Override
    public void sunet() {
        System.out.println("Gaina " + nume + "cotcodaceste");
    }

    @Override
    public void mananca() {
        System.out.println("Gaina " + nume + "manaca rame");
    }

    @Override
    public void utilitate() {
        System.out.println("Gaina este crescuta pentru carne si oua");
    }

    public String toString() {
        return String.format("Gaina");
    }
}

