package com.orange.students.andries.felix.Tema2;

public class Exercitiu_2 {

    /* 2)	Se da array-ul String-uri : "a", "b", "c", "d" , "f"
    Creati un nou array in care sa adaugati majusculele literelor din array. */

  public static void main(String[] args) {
      String  lowercaseArr [] = {"a", "b", "c", "d" , "f"};

      for (int i = 0; i < lowercaseArr.length; i++ ) {

          lowercaseArr[i] = lowercaseArr[i].toUpperCase();

          System.out.println(lowercaseArr[i]);


      }
  }

}
