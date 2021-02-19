package com.orange.topics.constructors;

public class SimpleClassMain {
    public static void main(String args[]) {

        SimpleClass simpleClass = new SimpleClass(5, 7.8);
        System.out.println(simpleClass.getMyInt());
        System.out.println(simpleClass.myDouble);
        System.out.println(simpleClass.getMyStr());
        System.out.println(simpleClass.myBool);

        SimpleClass secondClass = new SimpleClass(5, 7.8, "Salut", true);
        System.out.println(secondClass.getMyInt());
        System.out.println(secondClass.myDouble);
        System.out.println(secondClass.getMyStr());
        System.out.println(secondClass.myBool);

        SimpleClass thirdClass = new SimpleClass((byte)12, 5.3f, 'a' , true);
        System.out.println(thirdClass.getMyInt());
        System.out.println(thirdClass.myDouble);
        System.out.println(thirdClass.getMyStr());
        System.out.println(thirdClass.myBool);



    }
}
