package com.stackroute.pe5;

/* Write a program where an array of strings is input and output is a Map< String ,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false} */

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMoreThan2 {
    public static Map<String, String> More(String s){
        Map<String, String> result = new HashMap<String, String>();
        String[] ar = s.split(" ");

        for (int i = 0; i < ar.length; i++) {
            Pattern pattern = Pattern.compile(ar[i]);
            Matcher matcher = pattern.matcher(s);
            int count = 0;
            while (matcher.find()) {
                count += 1;
            }
            if(count>=2)
                result.put(ar[i], "true" );
            else
                result.put(ar[i],"false");
        }
        return result;
    }
}
