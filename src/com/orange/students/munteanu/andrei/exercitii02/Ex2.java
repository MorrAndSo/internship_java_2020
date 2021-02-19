package com.orange.students.munteanu.andrei.exercitii02;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {

        String[] low = {"a", "b", "c", "d", "f"};

        //  String aString = Arrays.toString(low);
        //  System.out.println(aString.toUpperCase());

        String[] a2 = new String[low.length];
        for (int i = 0; i < low.length; i++) {

            a2[i] = low[i].toUpperCase();

            System.out.println(a2[i]);
        }
    }
}

