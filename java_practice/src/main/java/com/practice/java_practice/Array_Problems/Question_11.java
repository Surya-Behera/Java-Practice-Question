package com.practice.java_practice.Array_Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Question_11 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,2,3,4,1,2};
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }

        HashMap<Integer,Integer>  map=new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else {
                map.put(ele,1);
            }
        }


        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==3){
                System.out.println(entry.getKey());
            }

        }


        System.out.println(map);

        System.out.println(set);
    }
}
