package com.orange.students.calarasu.marius.exercisesWhitScanner.exercise01;

import java.util.ArrayList;
import java.util.Collections;


public class UtilClassEx01 {

    protected static ArrayList<Integer> returnList(String input) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        String[] numbers = input.split(",");
        for (String number : numbers) {
            numbersList.add(Integer.valueOf(number));
        }
        return numbersList;
    }

    protected static void sortedListInDescendingOrder(ArrayList<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    protected static void sortedListInAscendingOrder(ArrayList<Integer> list) {
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
