package com.orange.students.calarasu.marius.week.three;

public class LogicalOperators {
    public static void main(String[] args) {
        // Folositi un "Logical and" intr-un while loop

        int numberA = 5;
        int numberB = 7;
        int numberC = 2;

        while (numberA <= 10 && numberA >= 5) {
            System.out.println(numberA);
            numberA++;
        }
        System.out.println();

        // Folositi un "Logical or" intr-un for loop

        for (numberB = 7, numberC = 2; numberB < 10 || numberC < 10; numberB++, numberC++) {
            System.out.println(numberB + numberC);
        }
        System.out.println();

        // Folositi un "Logical not" impreuna cu "Logical and" si "Logical or" in 2 for
        // loops

        for (numberA = 5, numberB = 7; numberA < 10 || !(numberB > 10); numberA++, numberB++) {
            System.out.println(numberA + numberB);
        }
        System.out.println();

        for (numberA = 5, numberC = 2; numberA < 10 && !(numberC > 10); numberA++, numberC++) {
            System.out.println(numberA + numberC);
        }
    }

}
