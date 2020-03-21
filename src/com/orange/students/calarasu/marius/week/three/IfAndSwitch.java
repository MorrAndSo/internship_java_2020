package com.orange.students.calarasu.marius.week.three;

//* Creati un exemplu de if else in care sa verificati o conditie.
public class IfAndSwitch {
    public static void main(String[] args) {
        int number = -15;

        if (number > 0) {
            System.out.println("Number " + number + " is positive.");
        } else if (number == 0) {
            System.out.println("The number is zero !!!");
        } else
            System.out.println("Number " + number + " is negative.");

        // * Transformati exemplu "if else" de mai sus intr-un operator ternar (Ternary
        // Operator).

        String result = (number > 0) ? " is positive." : " is negative.";
        System.out.println("Number " + number + result);

        // * Creati un Switch , in care sa aveti minim 3 "case" si un "default", iar
        // expresia verificata sa fie de tipul String.

        String apple = "yallow";

        switch (apple) {
            case "red":
                System.out.println("The apples are red.");
                break;
            case "green":
                System.out.println("The apples are green.");
                break;
            case "yallow":
                System.out.println("The apples are yallow.");
                break;
            default:
                System.out.println("There are no apples of this color.");

        }
    }
}

