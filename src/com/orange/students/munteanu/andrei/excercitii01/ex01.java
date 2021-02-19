package com.orange.students.munteanu.andrei.excercitii01;

public class ex01 {

        public static void main(String[] args) {

            int time = 66;
            double x = 64.5d;
            float y = 5.2f;
            char z = 'z';
            byte b = 2;

            Integer time2 = new Integer(time+ 5);
            Double x2 = new Double(x + 5);
            Float y2 = new Float(y + 2.3);
            Character z2 = new Character(z);
            Byte b2 = new Byte(b);


            System.out.println(Byte.toString(b));
            System.out.println(Byte.toString(b2));
            System.out.println("//////////////");
            System.out.println(Integer.toString(time));
            System.out.println(Integer.toString(time2));
            System.out.println("//////////////");
            System.out.println((Double.toString(x)));
            System.out.println(Double.toString(x2));
            System.out.println("//////////////");
            System.out.println(Float.toString(y));
            System.out.println(Float.toString(y2));
            System.out.println("//////////////");
            System.out.println(Character.toString(z));
            System.out.println(Character.toString(z2));

            System.out.println("---------//////Widening Casting////////--------");

            double time3 = time;
            System.out.println(time3);
            double y3 = y;
            System.out.println(y3);
            float time4 = time;
            System.out.println(time4);
            int z3 = z;
            System.out.println(z3);
            int b3 = b;
            System.out.println(b3);
            System.out.println("---------//////Narrowing Casting////////--------");

            int x4 = (int) x;
            System.out.println(x4);
            int y4 = (int) y;
            System.out.println(y4);
            int z4 = (int)z;
            System.out.println(z4);
            long y5 = (long) y;
            System.out.println(y5);
        }

    }

