package com.orange.students.calarasu.marius.exercises1602;
/**Variables
 * creati 5 variabile primitive
 * creati 5 variabile pe care sa faceti "boxing" folosind primele 5 varibile
 * afisati valorile celor 10 varibile, iar pentru obiecte folositi metoda mostenita (toString())
 */
public class Variables {
    public static void main(String[] args) {

        int valInt = 5;
        long valLong = 1_000_000_000_000L;
        double valDouble = 2.1;
        float valFloat = 5.2347f;
        boolean valBoolean = true;

        Integer integerVal = 5;
        System.out.println(integerVal.toString());
        Long longVal = 1_000_000_000_000L;
        System.out.println(longVal.toString());
        Double doubleVal = 2.1;
        System.out.println(doubleVal.toString());
        Float floatVal = 5.2347f;
        System.out.println(floatVal.toString());
        Boolean booleanVal = true;
        System.out.println(booleanVal.toString());



    }

}
