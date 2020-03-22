package com.orange.students.calarasu.marius.collections.list.exemplul01;

import java.util.Comparator;
import java.util.*;


public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String major;

    public Student() {

    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name ='" + name + '\'' +
                ", age =" + age +
                ", major ='" + major + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    public class CompareAge implements Comparator<Student> {

        @Override
        public int compare(Student student1, Student student2) {
            if (student1.age == student2.age)
                return 0;
            else if (student1.age > student2.age)
                return 1;
            else return -1;
        }
    }

}


