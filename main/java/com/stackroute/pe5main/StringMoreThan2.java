package com.stackroute.pe5main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMoreThan2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        Map<String, String> res = new HashMap<String, String>();
        res=More(s);
        Set<Map.Entry<String, String>> st = res.entrySet();

        for (Map.Entry<String, String> me : st) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }

    public static Map<String, String> More(String s){
        Map<String, String> res = new HashMap<String, String>();
        String[] ar = s.split(" ");

        for (int i = 0; i < ar.length; i++) {
            Pattern p = Pattern.compile(ar[i]);
            Matcher m = p.matcher(s);
            int count = 0;
            while (m.find()) {
                count += 1;
            }
            if(count>=2)
                res.put(ar[i], "true" );
            else
                res.put(ar[i],"false");
        }
        return res;
    }
}
