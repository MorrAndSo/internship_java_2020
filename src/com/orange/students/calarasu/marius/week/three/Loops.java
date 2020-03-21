package com.orange.students.calarasu.marius.week.three;

public class Loops {

    public static void main(String[] args) {
        // * Creati un exemplu de "while" loop.

        int number = 1;
        while (number <= 7) {
            System.out.print(" " + number);
            number++;
        }
        System.out.println("\n");
        // * Creati un nou "while" loop, folosind conditia "if" utilizati cuvintele
        // cheie "continue" si "break" in interiorul while-ului

        int count = 0;
        while (count <= 10) {
            if (count == 5) {
                count++;
                continue;
            }
            System.out.print(" " + count);
            count++;
            if (count == 9)
                break;
        }
        System.out.println("\n");

        // * Refolositi primul "while", modificati conditia in asa fel incat sa fie
        // negativa, dar totusi sa ruleze macar o data.

        do {
            System.out.print(" " + number);
            number++;
        } while (number < 0);

        System.out.println("\n");

        // * Transcrieti "while-ul" initial intr-un "for" loop, care sa intoarca
        // aceleasi valori.

        for (number = 1; number <= 7; number++) {
            System.out.print(" " + number);
        }
    }

}

