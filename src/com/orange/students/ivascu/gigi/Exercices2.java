package com.orange.students.ivascu.gigi;

import java.util.Arrays;
import java.util.Locale;

public class Exercices2 {
    public static void main(String[] args){
//afisare  el in ordine crescatoare
        int[] array= {5,9,4,8,3,1,0,7,2};
        Arrays.sort(array);
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]);
        }

////toUpperCase
        String[] array2 = {"a","b","c","d","f"};
        for(int j=0;j<1; j++){
          //  array2[j]=array2[j].toUpperCase(Locale.ROOT);
            System.out.println(Arrays.toString(array2).toUpperCase(Locale.ROOT));

//toLowerCase&sort
        String[] array3 = {"F","W","A","C","B"};
        Arrays.sort(array3);
        for(int k=0; k< 1; k++){
            System.out.println(Arrays.toString(array3).toLowerCase(Locale.ROOT));
        }

//afisare toate el mai putin primul si a 3-lea nr impar

        int[] array4 = {1,8,5,3,4,9,5,3};

        int cnt = 0;
        for(int l=0; l<array4.length; l++){
            if(array4[l] %2 ==1){
                cnt +=1;
           //     System.out.println("counter is:"+cnt);
                if (cnt !=1 && cnt !=3 )
                    System.out.println(array4[l]);
            }
            else{
                System.out.println(array4[l]);
            }
        }

//afisare nr impare
        int[] array5={10,12,8,6,9,4,5,11};

            for(int m=0; m<array5.length; m++){
                if(array5[m] %2 ==0){
                    System.out.println(array5[m]);
                }
            }

//afisare el cu lungime de 2
        String[] litere = {"ab","cc","gg","a","kg","ert"};
            for(int n=0; n<litere.length; n++){
         //       if(litere[n].length() == 2){
                if(litere[n].matches("..")){
                    System.out.println(litere[n]);
                }
            }
        }
    }
}


