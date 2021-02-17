package com.orange.students.calarasu.marius.exercises1702;

/**
 * Se da array-ul String-uri : "a", "b", "c", "d" , "f"
 * Creati un nou array in care sa adaugati majusculele literelor din array.
 * indicatii : folositi for loop si metoda din obiectul String
 */
public class Exercise02 {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "f"};
        String[] upperCaseLetters = new String[letters.length];
        for (int i = 0; i < letters.length; i++) {
            upperCaseLetters[i] = letters[i].toUpperCase();
        }

        for (String letter : upperCaseLetters){
            System.out.print(letter + " ");
        }
    }
}
