package com.orange.students.calarasu.marius.exercisesWhitScanner.exercise02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * "Introduceti de la tastatura o lista de cuvinte separate prin virgula"
 * Dupa ce a fost introdus de la tastatura lista de cuvinte afisati meniul :
 * "
 * 1. cel mai scurt cuvant
 * 2. cel mai lung cuvant
 * 3. cuvintele de pe pozitia impare lowercase , cele pare UPPERCASE
 * 4. afiseaza cuvintele cu numar par de litere
 * 5. afiseaza cuvintele cu numar impar de litere
 * "
 * <p>
 * EX:
 * "Introduceti de la tastatura o lista de cuvinte separate prin virgula"
 * salut,holla,ciao,hi,hello
 * <p>
 * 1. cel mai scurt cuvant
 * 2. cel mai lung cuvant
 * 3. cuvintele de pe pozitia impare lowercase , cele pare UPPERCASE
 * 4. afiseaza cuvintele cu numar par de litere
 * 5. afiseaza cuvintele cu numar impar de litere
 * <p>
 * 1
 * "hi"
 * SAU
 * 3
 * "salut,HOLLA,ciao,HI,hello"
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduceti de la tastatura o lista de cuvinte separate prin virgula");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();
        ArrayList<String> stringList = UtilClassEx02.returnStringList(sentence);
        Menu.displayMenu();
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Cel mai scurt cuvant este : ");
                UtilClassEx02.smallestWord(stringList);
                break;
            case 2:
                System.out.print("Cel mai lung cuvant este : ");
                UtilClassEx02.biggestWord(stringList);
                break;
            case 3:
                System.out.println("Cuvintele de pe pozitia impare lowercase , cele pare UPPERCASE :");
                UtilClassEx02.displayLowerCaseForOddAndUpperCaseForEvenLength(stringList);
                break;
            case 4:
                System.out.println("Cuvintele cu numar par de litere sunt :");
                UtilClassEx02.displayWordsWithEvenLength(stringList);
                break;
            case 5:
                System.out.println("Cuvintele cu numar impar de litere sunt : ");
                UtilClassEx02.displayWordsWithOddLength(stringList);
                break;
            default:
                System.out.println("Invalid choise !!! \n  Please choose a number from the menu !!!");
        }

    }
}
