package com.orange.students.calarasu.marius.exercises1602;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

/**
 * LoopsAndIfElseExercices
 * Creati un array de String-uri, care sa aibe 5 elemente.
 * Creati un "while" loop si for loop care sa parcurga elementele din array.
 * Folositi un for-each loop pentru a parcurge elementele din array.
 * Creati un nou "while" loop, folosind conditia "if" utilizati cuvintele cheie "continue" si "break" in interiorul while-ului
 * <p>
 * Afisati folosind un loop toate elementele din array, mai putin elementul de la mijloc
 * fara sa specificati in clar in verificare care este pozitia elementului, trebuie gasita dinamic.
 * <p>
 * Creati un exemplu de if else in care sa verificati o conditie.
 * Transformati exemplu "if else" de mai sus intr-un operator ternar (Ternary Operator).
 */

public class LoopsAndIfElseExercises {
    public static void main(String[] args) {

        String[] colors = {"red", "white", "black", "pink", "yellow"};

        System.out.println("--- Print using a 'four loop' --- ");
        for (int count = 0; count < colors.length; count++) {
            System.out.println(colors[count]);
        }

        System.out.println("--- Print using a 'while loop' --- ");
        int count = 0;
        while (count < colors.length) {
            System.out.println(colors[count]);
            count++;
        }

        System.out.println("--- Print using a 'four each loop' --- ");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("--- Using 'break' and 'continue' ---");

        int index = 0;
        while (index < colors.length) {
            if (colors[index].equals("black")) {
                index++;
                continue;
            }
            if (colors[index].equals("pink")) {
                index++;
                break;
            }
            System.out.println(colors[index]);
            index++;
        }

        System.out.println(" --- Print elements of the array minus the middle element ---");

        int firstMiddle = 0;
        int secondMiddle = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors.length % 2 == 0) {
                firstMiddle = colors.length / 2;
                secondMiddle = colors.length / 2 - 1;
                if(i == firstMiddle || i == secondMiddle){
                    continue;
                }
            } else {
                firstMiddle = colors.length / 2;
                if(i == firstMiddle){
                    continue;
                }
            }
            System.out.println(colors[i]);
        }

        System.out.println("--- if else condition example ---");

        int number  = 5;
        if(number > 0){
            System.out.println(" The number is greater then 0");
        }else{
            System.out.println("The umber is smaller then 0 ");
        }

        System.out.println("--- Ternary operator --- ");

        String result;
        result = (number > 0) ? " The number is greater then 0" : "The number is smaller then 0";
        System.out.println(result);
    }
}
