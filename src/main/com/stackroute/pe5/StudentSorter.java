package com.stackroute.pe5;

/* Create a Student class that represents the following information of a student: id, name, and age all
the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having same
age, sort based on their name.
f. For students having same name and age, sort them according to their ID. */

import java.util.Comparator;

public class StudentSorter implements Comparator {

    public int compare(Object o1,Object o2) {

        Student student1=(Student)o1;
        Student student2=(Student)o2;

        if(student1.getAge()==student2.getAge())
        {
            if(student1.getId()>student2.getId())
                return 1;
            else
                return -1;
        }
        else if(student1.getAge()<student2.getAge())
            return 1;
        else
            return -1;

    }
}