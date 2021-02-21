package com.orange.students.andries.felix.Tema2;

public class Exercitiu_3 {

    /*Se da array-ul String-uri : "F", "W", "A", "C", "B"
Creati un nou array in care sa ordonati minusculele literelor din array.
indicatii : folositi loops si metoda din obiectul String. */


    public static void main(String[] args) {
        String uppercaseArr [] = {"F", "W", "A", "C", "B"};


        for (int i = 0; i < uppercaseArr.length; i++ ) {


            uppercaseArr[i] = uppercaseArr[i].toLowerCase();

            System.out.println(uppercaseArr[i]);
        }
    }

}
