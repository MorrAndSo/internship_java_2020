package com.orange.students.munteanu.andrei.exercitii02;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args){

        int[] a = {5,9,4,8,3,1,0,7,2};

        Arrays.sort(a);
        System.out.println("a = "+ Arrays.toString(a));

        for (int i = a.length - 1; i >= 0  ; i--)
        {
            System.out.println(a[i]);
        }


    }

}
