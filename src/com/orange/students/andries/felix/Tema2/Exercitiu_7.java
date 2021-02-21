package com.orange.students.andries.felix.Tema2;

import java.util.Locale;

public class Exercitiu_7 {
    /* Se da array-ul de String-uri : "ab", "cc", "gg", "a" , "kg", "ert"
    Afisati doar elementele cu 2 caractere.
            indicatii : folositi loop si metoda din obiectul String */

    public static void main(String[] args) {

        String myStrings [] = {"ab", "cc", "gg", "a" , "kg", "ert"};
        for(String strings : myStrings) {
            if(strings.length() == 2) {

                System.out.println(strings);

            }
        }
    }
}
