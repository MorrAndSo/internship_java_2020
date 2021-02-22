package com.orange.students.ivascu.gigi;

public class Main {
    public static void main(String[] args){
        int valInt = 10;
        byte valByte = 5;
        char valChar = '4';
        double valDouble = 18.5;
        float valFloat = 7.2f;

        System.out.println(valInt);
        System.out.println(valByte);
        System.out.println(valChar);
        System.out.println(valDouble);
        System.out.println(valFloat);
//boxing
        Integer valInt2 = new Integer(valInt);
        System.out.println("valInt2=" + valInt2.toString());

        Byte valByte2 = new Byte(valByte);
        System.out.println("valByte2=" + valByte2.toString());

        Character valChar2 = new Character(valChar);
        System.out.println(("valChar2=" + valChar2.toString()));

        Double valDouble2 = new Double(valDouble);
        System.out.println("valDouble2=" + valDouble2.toString());

        Float valFloat2 = new Float(valFloat);
        System.out.println("valFloat2=" + valFloat2.toString());

//widening Casting
        double doubleCast = valInt;
        long longCast = valChar;
        int byteCast = valByte;
        double doubleCast2 = valFloat;
        float floatCast = valChar;
        System.out.println(doubleCast);
        System.out.println(longCast);
        System.out.println(byteCast);
        System.out.println(doubleCast2);
        System.out.println(floatCast + " " +
                "end casting");
//Narrowing Casting
        int intNrw = (int) valDouble;
        int intNrw2 = (int) valFloat;
        char charNrw = (char) valInt;
        byte byteNrw = (byte) valChar;
        float floatNrw = (float) valDouble;
        System.out.println(intNrw);
        System.out.println(intNrw2);
        System.out.println(charNrw);
        System.out.println(byteNrw);
        System.out.println(floatNrw + " end narrowing");



    }
}
