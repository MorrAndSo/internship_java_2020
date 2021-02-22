package com.orange.students.ivascu.gigi;

public class Exercices {
    public static void main(String[] args){
//#1
        String[] array = {"unu", "doi", "trei", "patru", "cinci"
        };
//#2
        for (int i=0; i< array.length; i++){
            System.out.println(array[i] + " __end for loop");
        }

//#3
        for(String i : array){
            System.out.println(i);
        }
//#4 break
        for (int i=0; i< array.length; i++){
            if(i== array.length){
                break;
            }
            System.out.println(array[i] + "_break");
        }
    //continue
        int i = 0;
        while(i<array.length){
            if(i == array.length){
                i++;
                continue;
            }
            System.out.println(array[i] + "_continue");
            i++;
        }
//#5
//middle array//////////////////impar
        int j = 0;
        while(j<array.length/2){
            j++;
            continue;
        }
        System.out.println(array[j]);
        j++;
        ///////////////////////

        int lungime = array.length;
        int middle = array.length/2;
        System.out.println(middle);
//element precizat,raportat la jumatate
        int k = 0;
        while(k<lungime/2+2){
            k++;
            continue;
        }
            System.out.println(array[k]);
            k++;
//first half
        for (int x=0; x< array.length/2; x++){
            System.out.println(array[x] + " __end for loop");
        }
        int[] half1 = new int[(lungime/2+1)];
        int[] half2 = new int[lungime - half1.length];

/*
        for(int z=0; z<lungime; z++){
            if(z<half1.length)
                half1[z] = array[z];
            else
                half2[z - half1]=array[z];
        }
        System.out.println(Arrays.toString(half1));


        for(int z=0; z< array.length; z++){
            System.out.println(array[z]);

*/
        int midStart, midEnd = 0;
        midStart = (array.length - 1) / 2;
        midEnd = (array.length - 1) - midStart;
        System.out.println(midStart);
        System.out.println(midEnd);
        for (int z=0; z<array.length;z++){
            if(z != midEnd && z != midStart){
                System.out.println(array[z]);
            }

        }
    }
}
