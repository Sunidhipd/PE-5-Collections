package com.stackroute.pe5;
/* Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive */

import java.util.*;

public class SortStringArray {

       public static List<String> Sort(String s){
        String arrayInput[]=s.split(" ");
        SortedSet<String> sortedNames = new TreeSet<>();
        for (int i=0;i<arrayInput.length;i++){
            sortedNames.add(arrayInput[i]);
        }
        List<String> result=new ArrayList<String>();
        result.addAll(sortedNames);
        return  result;
    }
}
