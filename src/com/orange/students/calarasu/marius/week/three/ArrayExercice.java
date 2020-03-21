package com.orange.students.calarasu.marius.week.three;

public class ArrayExercice {
    public static void main(String[] args) {

        // * Creati un array de String-uri, care sa aibe 5 elemente.

        String[] fruits = {"apples", "pears", "peaches", "straberrie", "bannanas", "kiwi"};

        // * Modificati elementul 5 din array.

        fruits[4] = "blueberrie";

        // Parcurgeti array-ul folosind un for si un for-each, iar acolo unde se poate
        // folositi lenght pe array (array.lenght)

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();
        // * Afisati folosind un loop toate elementele din array, mai putin elementul de
        // la mijloc
        // fara sa specificati in clar in verificare care este pozitia elementului,
        // trebuie gasita dinamic.

        for (String fruit : fruits) {
            if (fruits.length % 2 != 0) {

                if (fruits[fruits.length / 2] == fruit)
                    continue;
                System.out.println(fruit);

            } else if (fruits.length % 2 == 0) {

                if (fruits[(fruits.length / 2) - 1] == fruit)
                    continue;
                if (fruits[fruits.length / 2] == fruit)
                    continue;
                System.out.println(fruit);
            }

        }

        System.out.println();

        // Creati un array multidimensional de int-uri si sa-l parcurgeti

        int[][] numbers = {{14, 13, 45, 24, 10}, {15, 44, 23, 20, 1}};
        for (int grupa = 0; grupa < numbers.length; grupa++) {
            for (int element = 0; element < numbers[grupa].length; element++) {
                System.out.print(numbers[grupa][element] + " ");

            }
            System.out.println();

        }
    }

}

