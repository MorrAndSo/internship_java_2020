package com.orange.students.andries.felix.Tema2;

public class Exercitiu_5 {

   /* Se da array-ul : 10,12,8,6,9,4,5,11
    Afisati numelere pare.
            idnciatii : folositi loops si operatorul % */


    public static void main (String arg[]) {
        int myEvenNumbers[] =  {  10,12,8,6,9,4,5,11};

    for (int i = 0; i < myEvenNumbers.length; i++){

        if(myEvenNumbers[i] % 2 == 0){
           System.out.println( myEvenNumbers[i] + " ");
        }
    }

    }


    }

