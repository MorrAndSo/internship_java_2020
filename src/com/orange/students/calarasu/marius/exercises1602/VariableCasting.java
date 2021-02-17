package com.orange.students.calarasu.marius.exercises1602;
/**
VariabileCasting
	* creati 5 variabile si sa le valorizati
	* creati cateva variabile noi si sa faceti Widening Casting si Narrowing Casting pe cele 5 variabile
	apoi sa afisati rezultatele
**/
public class VariableCasting {
    public static void main(String[] args) {

        int intVal = 5;
        double doubleVal = intVal;
        System.out.println(doubleVal);

        short shortVal = (short) intVal;
        System.out.println(shortVal);

        double doubleValToCast = 5.89;
        int intValue = (int) doubleValToCast;
        System.out.println(intValue);

        float floatVal = (float) doubleValToCast;
        System.out.println(floatVal);

    }
}
