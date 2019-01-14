package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {


    @Test
    public void sortStudents() {
        List<Student> students = new ArrayList<>();
        Student ob1 = new Student(103, "Sunidhi", 22);
        Student ob2 = new Student(111, "Urvashi", 23);
        Student ob3 = new Student(110, "Rashmi", 21);
        Student ob4 = new Student(104, "Ammu", 22);
        Student ob5 = new Student(107, "Ammu", 22);

        students.add(ob1);
        students.add(ob2);
        students.add(ob3);
        students.add(ob4);
        students.add(ob5);

        System.out.println("Unsorted array is");

        Iterator it = students.iterator();
        while (it.hasNext()) {
            Student element = (Student) it.next();
            System.out.print(element.getId() + " " + element.getName() + " " + element.getAge() + " ");
            System.out.println();
        }

        System.out.println();
        System.out.println("Sorted according to their age is");
        MainTest obj = new MainTest();
        List<Student> s=obj.SortStudents(students);
        assertEquals(s,s);

    }
}