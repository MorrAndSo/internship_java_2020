package com.orange.students.munteanu.andrei.exercitii02;

public class Ex3 {
    public static void main(String[] args) {

        String[] up = {"F", "W", "A", "C", "B"};

        String[] aString = new String[up.length];
        for (int j = 0; j < up.length; j++) {
            aString[j] = up[j].toLowerCase();

            System.out.println(aString[j]);
            }
        }
    }