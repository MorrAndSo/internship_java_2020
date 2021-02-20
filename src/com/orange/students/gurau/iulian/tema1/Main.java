package Exercitii1;

import Exercitii1.Tema1;

public class Main {
    public static void main(String[] args) {

        Tema1 obiectTema1 = new Tema1();
        System.out.println("1.Variables :");
        System.out.println(obiectTema1.Number1);
        System.out.println(obiectTema1.Number3);
        System.out.println(obiectTema1.Number5);
        System.out.println(obiectTema1.Number6);
        System.out.println(obiectTema1.isNumber);
        System.out.println("---------------------");

        System.out.println(obiectTema1.byteObj.toString());
        System.out.println(obiectTema1.intObj.toString());
        System.out.println(obiectTema1.floatObj.toString());
        System.out.println(obiectTema1.doubleObj.toString());
        System.out.println(obiectTema1.booleanObj.toString());
        System.out.println("---------------------");

        System.out.println("VariabileCasting: ");
        System.out.println(obiectTema1.byteToInt);
        System.out.println(obiectTema1.intToByte);
        System.out.println(obiectTema1.floatTodouble);
        System.out.println(obiectTema1.doubleToFloat);
        System.out.println(obiectTema1.shortToLong);
        System.out.println("---------------------");

        System.out.println("MathExercises: ");
        System.out.println(obiectTema1.operator1);
        System.out.println(obiectTema1.operator2);
        System.out.println(obiectTema1.operator3);
        System.out.println("---------------------");

        System.out.println("While: ");
        while (obiectTema1.i < obiectTema1.tv.length) {
            System.out.println(obiectTema1.tv[obiectTema1.i]);
            obiectTema1.i++;
        }
        System.out.println("---------------------");

        System.out.println("For: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(obiectTema1.tv[i]);
        }
        System.out.println("---------------------");

        System.out.println("For-each: ");
        for (String tv : obiectTema1.tv) {
            System.out.println(tv);
            System.out.println("For-each");
        }
        System.out.println("---------------------");
        System.out.println("While loop break/continue: ");

        while (obiectTema1.i2 < obiectTema1.tv.length) {
            System.out.println(obiectTema1.tv[obiectTema1.i2]);
            obiectTema1.i2++;
            if (obiectTema1.i2==2){
                break;
            }else if (obiectTema1.i2==1){

                obiectTema1.i2++;
                continue;
            }

        }
        System.out.println("---------------------");

// Afisati folosind un loop toate elementele din array, mai putin elementul de la mijloc
//		fara sa specificati in clar in verificare care este pozitia elementului, trebuie gasita dinamic.

        System.out.println("//Elimina elementul din mijloc ");
        while (obiectTema1.i3 < obiectTema1.tv.length) {
            System.out.println(obiectTema1.tv[obiectTema1.i3]);
            obiectTema1.i3++;
            if (obiectTema1.i3== obiectTema1.tv.length/2) {
                obiectTema1.i3++;
                continue;
            }
        }
        System.out.println("---------------------");

//Creati un exemplu de if else in care sa verificati o conditie.
//Transformati exemplu "if else" de mai sus intr-un operator ternar (Ternary Operator).
        System.out.println("If si If operator tenar:");

        if (obiectTema1.tooMuchCoding==true) {
            System.out.println("Hai afara la zapada !");
        } else {
            System.out.println("Sau nu vrei la zapada...");
        }

        String ifTenar = obiectTema1.tooMuchCoding ? "Hai afara la zapada !" : "Sau nu vrei la zapada...";
        System.out.println(ifTenar);
        System.out.println("---------------------");
   }
}