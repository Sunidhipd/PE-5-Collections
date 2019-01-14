package com.stackroute.pe5;

/*Write a program to find the number of counts in the following String . Store the output in
Map< String ,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2} */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordCount {
    public static Map<String, Integer> count(String s){

    Map<String, Integer> res = new HashMap<String, Integer>();
        String[] ar = s.split(" ");

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
