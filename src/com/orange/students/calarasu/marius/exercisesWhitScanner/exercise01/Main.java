package com.orange.students.calarasu.marius.exercisesWhitScanner.exercise01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Creati programele prin care sa introduceti de la tastatura valori, dupa cum urmeaza:
 * <p>
 * 1)
 * "Introduceti de la tastatura o lista de numere separate prin virgula"
 * <p>
 * Dupa ce a fost introdus de la tastatura lista de numere afisati meniul :
 * "
 * 1.intoarceti cel mai mare numar.
 * 2.intoarceti cel mai mic numar
 * 3.intoarceti lista sortata crescator
 * 4.intoarceti lista sortata descrescator
 * "
 * <p>
 * Dupa ce o optiune a fost aleasa, sa se returneze valoarea asteptata.
 * <p>
 * EX:
 * "Introduceti de la tastatura o lista de numere separate prin virgula"
 * 1,5,9,7,8,3,5,1,6
 * <p>
 * 1. gaseste cel mai mare numar.
 * 2. gaseste cel mai mic numar
 * 3. sortata crescator
 * 4. sortata descrescator
 * <p>
 * 2
 * "1"
 * SAU
 * 4
 * "9,8,7,6,5,5,3,1,1"
 * <p>
 * Hint : folositi metoda "split()" din String.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Introduceti de la tastatura o lista de numere separate prin virgula");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Menu.displayMenu();
        int choice = scanner.nextInt();
        ArrayList<Integer> numberList = UtilClassEx01.returnList(input);

        switch (choice) {
            case 1:
                System.out.print("Cel mai mare numar este : ");
                System.out.println(Collections.max(numberList));
                break;
            case 2:
                System.out.print("Cel mai mic numar este : ");
                System.out.println(Collections.min(numberList));
                break;
            case 3:
                System.out.println("Lista sortata crescator :");
                UtilClassEx01.sortedListInAscendingOrder(numberList);
                break;
            case 4:
                System.out.println("Lista sordata descrescator :");
                UtilClassEx01.sortedListInDescendingOrder(numberList);
                break;
            default:
                System.out.println("Invalid choise !!! \n  Please choose a number from the menu !!!");
        }
    }
}
