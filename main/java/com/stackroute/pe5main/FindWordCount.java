package com.stackroute.pe5main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        Map<String, Integer> res = new HashMap<String, Integer>();
        res = count(s);
        Set<Map.Entry<String, Integer>> st = res.entrySet();

        for (Map.Entry<String, Integer> me : st) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

    public static Map<String, Integer> count(String s){

    Map<String, Integer> res = new HashMap<String, Integer>();
        String[] ar = s.split(" ");
        String regex = "";

        for (int i = 0; i < ar.length; i++) {
            Pattern p = Pattern.compile(ar[i]);
            Matcher m = p.matcher(s);
            int count = 0;
            while (m.find()) {
                count += 1;
            }
            res.put(ar[i], count);
        }
       return res;
    }
}
