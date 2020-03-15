package com.orange.topics.abstractTopic;

public class MainCarClass {
    //In acest Topic  avem :
    // abstration -- clasa parinte este abstracta, iar copii trebuie sa implementeze metoda abstracta din parinte.
    // monstenire -- Audi si Volvo fac extend pe Car
    // incapsulare -- variabile private si metode Get si Set
    // polimorfism -- metoda toString, are 3 comportamente diferite, la nivel de parinte si copii
    public static void main(String args[]){
        Car myAudi = new Audi("rosu",4,false,"A4");
        //((Audi) myAudi).setModel("A4"); Pentru ca metoda setModel e declarata doar in clasa Audi, trebuie facur cast
        //sa putem da aceasta valoare la o instanta Car... pentru a evita situatii de genu putem folosi exemplul de mai jos.
        System.out.println(myAudi.toString());
        Audi myAudi2 = new Audi();
        myAudi2.setCuloare("negru");
        myAudi2.setNrRoti(4);
        myAudi2.setDiesel(true);
        myAudi2.setModel("A7");
        System.out.println(myAudi2.toString());

        Car myVolvo = new Volvo();
        myVolvo.setCuloare("albastru");
        myVolvo.setNrRoti(6);
        myVolvo.setDiesel(false);
        //myVolvo.setModel("CX90"); Pentru ca a fost declarat la nivel de clasa copil caracteristica "model",
        //mai exact in clasa Audi, Volvo nu va avea aceasta caracteristica...deci avem un copil cu alt comportament.
        System.out.println(myVolvo);
    }
}
