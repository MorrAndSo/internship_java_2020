package com.orange.students.andries.felix.Tema2;

public class Exercitiu_1 {

    public static void main(String[] args) {


        int[] arr = {5, 9, 4, 8, 3, 1, 0, 7, 2};

        int temp = 0;


        //  Sortare in ordine  crescatoare

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println("Elemente array in ordine crescatoare");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}



