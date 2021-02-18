package com.orange.students.calarasu.marius.exercises1702;

/**
 * Se da array-ul : 1,8,5,3,4,9,5,3
 * Afisati pe rand fiecare numar, mai putin primul si al 3lea numar impar din array
 * indicatii : folositi loops si operatorul %
 */

public class Exercise04 {
    public static void main(String[] args) {

        int[] numbers = {1, 8, 5, 3, 4, 9, 5, 3};
        int countOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                countOdd++;
                if (countOdd == 1 || countOdd == 3) continue;
            }
            System.out.println(numbers[i]);
        }
    }
}

