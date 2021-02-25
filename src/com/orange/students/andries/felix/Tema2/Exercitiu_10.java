package com.orange.students.andries.felix.Tema2;

public class Exercitiu_10 {
    //  Se da array-ul de String-uri : 4,5,7,2,3,1,6,3,6,1,2,5,3
    //Afisati folosind un switch, pentru fiecare numar din array ziua saptamanii corespunzatoare
    //indicatii : loop pentru parcurgerea array-ului, switch apelat pt fiecare valoare in parte,
    //ex : 1 va afisa luni, 7 duminica.



    public static void main(String[] args){

        String[] dayNumber = {"4","5","7","2","3","1","6","3","6","1","2","5","3"};

        for(int i = 0; i < dayNumber.length; i++){

            switch(dayNumber[i])
            {


                case "1":
                    System.out.println("Luni");
                    break;
                case "2":
                    System.out.println("Marti");
                    break;
                case "3":
                    System.out.println("Miercuri");
                    break;

                case "4":
                    System.out.println("Joi");
                    break;

                case "5":
                    System.out.println("Vineri");
                    break;

                case "6":
                    System.out.println("Sambata");
                    break;


                case "7":
                    System.out.println("Duminica");
                    break;

            }
        }
    }
}
