package com.avi.java8codingquestions2024;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyMapWords {


    public static void main(String[] args) {
        Map<String,Integer> frequencyWords= new HashMap<>();

        String s="My Name is Aviral Aviral is a Software developer";
        String[] strArray=s.split(" ");
        for(String str:strArray){

            //if(frequencyWords.get(s))
            //frequencyWords.getOrDefault(s,1);
            frequencyWords.put(str,frequencyWords.getOrDefault(str,0)+1);
        }
        System.out.println(frequencyWords);
       // HashMap stores entries (Key-Value pairs) in random-order of Keys
       // LinkedHashMap stores entries (Key-Value pairs) as per insertion-order of Keys
        //TreeMap stores entries (Key-Value pairs) in sorted-order of Keys

        //we need to sort a map by its values in descending order
        Map<String,Integer> sortedMap=new LinkedHashMap<>();//because its insertion order is preserved
        sortedMap=frequencyWords.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldvalue,newvalue)->oldvalue,LinkedHashMap::new));
    }
}
