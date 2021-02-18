package com.orange.students.calarasu.marius.exercises1702;
/**
 * Se da array-ul String-uri : "F", "W", "A", "C", "B"
 * Creati un nou array in care sa ordonati minusculele literelor din array.
 * indicatii : folositi loops si metoda din obiectul String.
 * */
public class Exercise03 {
    public static void main(String[] args) {

        String [] letters = {"F", "W", "A", "C", "B"};
        String [] lowerCaseLetters = new String[letters.length];

        for(int i = 0; i < letters.length; i++){
            lowerCaseLetters[i] = letters[i].toLowerCase();
        }

        for (String letter : lowerCaseLetters){
            System.out.print(letter + " ");
        }
    }
}
