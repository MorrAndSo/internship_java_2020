package com.orange.students.calarasu.marius.exercises1702;

/**
 * Se da array-ul : 10,12,8,6,9,4,5,11
 * Afisati numelere pare.
 * idnciatii : folositi loops si operatorul %
 */
public class Exercise05 {
    public static void main(String[] args) {

        int[] numbers = {10, 12, 8, 6, 9, 4, 5, 11};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
