package com.orange.students.andries.felix.Tema2;

public class Exercitiu_6 {


    /*Scrieti un program in care sa faceti conversia de la mile la kilometri,
si apoi afisati ca mai jos.*/



     static double mphToKm(double mph) {
         return mph * 1.60934;
     }


    public static void main(String[] args) {

double[] myMiles = {

        10.00, 20.00, 30.00, 40.00, 50.00, 60.00, 70.00


};

for (int i = 0; i  < myMiles.length; i++) {

    System.out.print("  " + mphToKm(myMiles[(i)]) + " km");
}




    }

}
