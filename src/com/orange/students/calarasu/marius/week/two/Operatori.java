package com.orange.students.calarasu.marius.week.two;

/*Operatori
	* creati cateva variabile si sa folositi cele 2 tipuri de operatori : Arithmetic si Assignment
	* sa faceti print la variabilele noi create .
	EX:  int valInt1 = 5, valInt2 = 6;
		 int valIntSum = valInt1 + valInt2;
		 System.out.println("valIntSum = " + valIntSum);*/
public class Operatori {

    public static void main(String[] args) {

        int number1 = 50;
        int number2 = 36;
        int valIntSum = number1 + number2;
        int valIntMultip = number1 * number2;
        int valIntDivide = number1 / number2;
        int valIntModulo = number1 % number2;

        System.out.println(number1 + " + " + number2 + " = " + valIntSum + ";");
        System.out.println(number1 + " * " + number2 + " = " + valIntMultip + ";");
        System.out.println(number1 + " / " + number2 + " = " + valIntDivide + ";");
        System.out.println(number1 + " % " + number2 + " = " + valIntModulo + ";");

    }
}