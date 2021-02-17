package com.orange.students.calarasu.marius.exercises1702;

import java.util.Arrays;

/**
 * Se da array-ul : 5,9,4,8,3,1,0,7,2
 * Orodnati crescator si descrestator si afisati rezultatul.
 * indicatii : folositi array si loops
 * */
public class Exercise01 {
    public static void main(String[] args) {
        int [] numbers = {5,9,4,8,3,1,0,7,2};
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (int i = numbers.length - 1; i >= 0  ; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
