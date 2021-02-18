package com.orange.students.calarasu.marius.exercises1702;

/**
 * Se da array-ul de String-uri : "ab", "cc", "gg", "a" , "kg", "ert"
 * Afisati doar elementele cu 2 caractere.
 * indicatii : folositi loop si metoda din obiectul String
 */
public class Exercise07 {
    public static void main(String[] args) {

        String[] strings = {"ab", "cc", "gg", "a", "kg", "ert"};
        for (String string : strings) {
            if (string.length() == 2) {
                System.out.println(string);
            }
        }
    }
}
