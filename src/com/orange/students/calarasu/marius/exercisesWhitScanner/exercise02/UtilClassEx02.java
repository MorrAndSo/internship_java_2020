package com.orange.students.calarasu.marius.exercisesWhitScanner.exercise02;

import java.util.ArrayList;
import java.util.Arrays;

public class UtilClassEx02 {

    protected static ArrayList<String> returnStringList(String sentence){
        ArrayList<String> stringsList = new ArrayList<>();
        String [] words = sentence.split(",");
        stringsList.addAll(Arrays.asList(words));
        return stringsList;
    }

    protected static void smallestWord(ArrayList<String> words){
       String smallestWord = words.get(0);
        for (int index = 1; index < words.size() - 1; index++) {
            if(words.get(index).length() < smallestWord.length()){
                smallestWord = words.get(index);
            }
        }
        System.out.println(smallestWord);
    }

    protected static void biggestWord(ArrayList<String> words){
        String biggestWord = words.get(0);
        for (int index = 1; index < words.size() - 1; index++) {
            if(words.get(index).length() > biggestWord.length()){
                biggestWord = words.get(index);
            }
        }
        System.out.println(biggestWord);
    }

    protected static void displayLowerCaseForOddAndUpperCaseForEvenLength(ArrayList<String> words){
        for(String word : words){
            if(word.length() % 2 == 0){
                System.out.println(word.toUpperCase());
            }else {
                System.out.println(word.toLowerCase());
            }
        }
    }

    protected static void displayWordsWithEvenLength(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    protected static void displayWordsWithOddLength(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        }
    }
}
