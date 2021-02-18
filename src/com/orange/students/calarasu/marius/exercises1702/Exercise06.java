package com.orange.students.calarasu.marius.exercises1702;
/**
 * 	Scrieti un program in care sa faceti conversia de la mile la kilometri,
 * si apoi afisati ca mai jos.
 *  mile 	kilometri
 *  10.00 16.09
 *  20.00 32.19
 *  30.00 48.28
 *  40.00 64.37
 *  50.00 80.47
 *  60.00 96.56
 *  70.00 112.65
 * indicatii : folositi array, for loop si metoda de transformare
 * */
public class Exercise06 {
    public static void main(String[] args) {
        Double [] miles = {10.00, 20.00, 30.00, 40.00, 50.00, 60.00, 70.00};
        System.out.println("mile  kilometers");
        for (Double mile : miles) {
            System.out.println(mile + "  " + convertMileInKm(mile));
        }
    }

    private static double convertMileInKm(double mile){
        return mile * 1.609;
    }
}
