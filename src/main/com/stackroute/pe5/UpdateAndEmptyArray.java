package com.stackroute.pe5;
/*Write a Java program to update specific array element by given element and empty the array list .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements [] */

import java.util.List;

public class UpdateAndEmptyArray {
    public List<String> modify(List<String> firstList,List<String> secondList){
        for(int i=0;i<secondList.size();i++){
            if(!firstList.contains(secondList.get(i))){
                int j=firstList.indexOf(secondList.get(i));
                firstList.set(j,secondList.get(i));
            }
        }
        firstList.clear();
        return firstList;
    }
}
