package com.orange.students.calarasu.marius.week.two;

/*VariabileCasting
	* creati 6 variabile : byte, short, int, long, float, double si sa le valorizati
	si sa faceti 2 exemple cu Widening Casting si Narrowing Casting si print la noile variabile.
	EX:  int valInt = 9;
		 double valDoubleNarrowed = valInt;
		 System.out.println("valDoubleNarrowed = " + valDoubleNarrowed);*/
public class VariabileCasting {

    public static void main(String[] args) {

        byte numByte = 56;
        short numShort = 120;
        int numInt = 230;
        long numLong = 100_203_205_256_200l;
        double numDouble = 52.256d;
        float numFloat = 5.2f;


        int valByteWidned = numByte;
        System.out.println("valByteWidned = " + valByteWidned);

        int valDoubleNarrowed = (int) numDouble;
        System.out.println("valDoubleNarrowed = " + valDoubleNarrowed);

        short valLongNarrowed = (short) numLong;
        System.out.println("valLongNarrowed = " + valLongNarrowed);

    }
}
