package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator {

    public int compare(Object o1,Object o2) {

        Student s1=(Student)o1;
        Student s2=(Student)o2;

        if(s1.getAge()==s2.getAge())
        {
            if(s1.getId()>s2.getId())
                return 1;
            else
                return -1;
        }
        else if(s1.getAge()<s2.getAge())
            return 1;
        else
            return -1;

    }
}