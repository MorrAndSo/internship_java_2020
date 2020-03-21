package com.orange.students.calarasu.marius.week.five.inplementation;

import com.orange.students.calarasu.marius.week.five.interfaces.*;

public class Vultur implements Salbatic, Aerian {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void zboara() {
        System.out.println("Vulturul zboara");
    }

    @Override
    public void sunet() {
        System.out.println("Vulturul scoate sunete ascutite....:)");
    }

    @Override
    public void mananca() {
        System.out.println("Se hraneste cu animale moarte");
    }

    @Override
    public void mediu() {
        System.out.println("Traieste in zonele de deal si de munte");
    }

    public String toString() {
        return String.format("Vultur");
    }
}

