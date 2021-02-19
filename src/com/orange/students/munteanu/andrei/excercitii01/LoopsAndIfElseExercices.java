package com.orange.students.munteanu.andrei.excercitii01;

import java.util.Arrays;

public class LoopsAndIfElseExercices {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "VW"};
        while (cars.length <= 5) {
            System.out.println(Arrays.toString(cars));
            break;
        }

        for (int i=0; i< cars.length; i++)
        {
            System.out.println(cars[i]);
        }
        System.out.println("/////for each loop/////");
            for (String car : cars) {
                System.out.println(car);

            }
        System.out.println("/////////////////////");
            while (cars.length ==5){
                System.out.println(Arrays.toString(cars));
                if(cars.length <=5)
                   break;

                    }
                }
            }
