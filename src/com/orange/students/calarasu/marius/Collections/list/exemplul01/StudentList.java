package com.orange.students.calarasu.marius.collections.list.exemplul01;

import java.util.*;
import java.lang.Comparable;

public class StudentList {

    public static ArrayList getList() {
        Student john = new Student();
        Student marry = new Student();
        Student danny = new Student();

        john.setAge(22);
        marry.setAge(21);
        danny.setAge(18);

        john.setName("John");
        marry.setName("Marry");
        danny.setName("Danny");

        john.setMajor("Math");
        marry.setMajor("Science");
        danny.setMajor("Business");

        ArrayList studentList = new ArrayList();
        studentList.add(john);
        studentList.add(marry);
        studentList.add(danny);
        return studentList;
    }

    static void iterateWithForLoop(Iterable iterable) {
        for (Object object :
                iterable) {
            System.out.println(object + ", ");
        }
        System.out.println();
    }

    static void iterateWithIterator(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
