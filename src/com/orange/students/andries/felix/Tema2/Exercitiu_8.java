package com.orange.students.andries.felix.Tema2;

public class Exercitiu_8 {


/*	Se da int x = 7;
    Afisati valoarea exacta pentru urmatoarea operatie :
            [(x / 2 ) * 5.1 ] + 1.23;
    indicatii : pentru calcule cu zecimale se foloseste long si float,
    int pierde din exactitate cand este folosit in operatii matematice ( / si * ) */

    public static void main(String[] args) {

        int x = 7;

        float operationResult = (float) ((x / 2) * 5.1 + 1.23);

            System.out.println(operationResult);
    }

}
