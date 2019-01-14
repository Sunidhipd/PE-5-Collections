package com.stackroute.pe5;
/* Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has a value, set the key `val2` to have that value, and
b. Set the key `val1` to have the value `" "` (empty string ).
Example 1:
The map {"val1": "java","val2": "c++"} should return {"val1": " ", "val2":"java"}
Example 2:
The map {"val1": "mars","val2": "saturn"}should return {"val1": " ", "val2":"mars"} */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyReplacement {
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

