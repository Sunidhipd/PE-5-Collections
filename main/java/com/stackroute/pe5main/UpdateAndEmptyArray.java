package com.stackroute.pe5main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateAndEmptyArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the List Size: ");
        int n=sc.nextInt();
        String s="";
        System.out.println("Enter the List: ");
        List<String> a=new ArrayList<String>(n);
        for(int i=0;i<n;i++) {
            s=sc.nextLine();
            a.add(s);
        }
        System.out.println("Enter the modified List: ");

        List<String> m=new ArrayList<String>(n);
        for(int i=0;i<n;i++) {
            s=sc.nextLine();
            m.add(s);
        }
        List<String> mod=modify(a,m);
        for(int i=0;i<mod.size();i++)
            System.out.println(mod.get(i));
    }

    public static List<String> modify(List<String> a,List<String> m){
        for(int i=0;i<m.size();i++){
            if(!a.contains(m.get(i))){
                int j=a.indexOf(m.get(i));
                a.set(j,m.get(i));
            }
        }

        //a.clear();
        return a;
    }
}
