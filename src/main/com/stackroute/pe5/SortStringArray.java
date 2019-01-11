package com.stackroute.pe5;

import java.util.*;

public class SortStringArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        List<String> res=Sort(s);
        System.out.println(res);

    }

       public static List<String> Sort(String s){
        String ar[]=s.split(" ");
        SortedSet<String> sortedNames = new TreeSet<>();
        for (int i=0;i<ar.length;i++){
            sortedNames.add(ar[i]);
        }
        List<String> r=new ArrayList<String>();
        r.addAll(sortedNames);
        return  r;
    }
}
