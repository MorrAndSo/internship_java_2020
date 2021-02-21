package com.orange.students.andries.felix.Tema2;

public class Exercitiu_9 {
 /*

 Se dau variabilele :
int myInt = 5511;
long myLong = 1185;
boolean myBool = true;
char myChar = 'a';
byte myByte = 123;

Executati pentru fiecare variabila in functie de cum se paote : Widening ,Narrowing si Boxing
indicatii : nu toate variabilele vor suportatoate tipuri de operatii.

  */

    public static void main(String[] args) {

        int myInt = 5511;
        long myLong = 1185;
        boolean myBool = true;
        char myChar = 'a';
        byte myByte = 123;



        float myFloat = myInt;
        int myInt2 = (int)myLong;
        int myInt3 = myChar;
        char myChar2 = (char)myByte;


        System.out.println(myFloat);
        System.out.println(myInt2);
        System.out.println(myInt3);
        System.out.println(myChar2);

        // De continuat
    }

}
