package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyReplacement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 key value pair in the map: ");
        Map<Object,String> map=new HashMap<Object, String>();
        for (int i=0;i<2;i++) {
            String s = sc.next();
            String S=sc.next();
            map.put(s,S);
        }
        Map<Object,String> res =replace(map);

        for (Map.Entry<Object, String> pair: res.entrySet()) {
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
    }

    public static Map<Object,String> replace(Map<Object,String> map){
        Object firstKey = map.keySet().toArray()[0];
        String valueForFirstKey = map.get(firstKey);
        Object SecondKey = map.keySet().toArray()[1];
        String valueForSecondKey = map.get(SecondKey);
            map.put(SecondKey,valueForFirstKey);
            map.put(firstKey,"");
            return map;
        }

    }

