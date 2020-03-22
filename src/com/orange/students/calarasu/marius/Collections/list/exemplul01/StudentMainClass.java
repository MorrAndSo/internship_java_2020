package com.orange.students.calarasu.marius.collections.list.exemplul01;

import java.util.*;

public class StudentMainClass {

    public static void main(String[] args) {

        ArrayList studentList = StudentList.getList();

        System.out.println("---- Sort after name ----" + "\n");
        Collections.sort(studentList);
        StudentList.iterateWithForLoop(studentList);

        System.out.println("---- Sort after age using inner class -----" + "\n");

        Student student = new Student();
        Student.CompareAge compareAge = student.new CompareAge();
        Collections.sort(studentList, student.new CompareAge());

        StudentList.iterateWithIterator(studentList);

        System.out.println();

    }
}
