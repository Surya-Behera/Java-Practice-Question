package com.practice.java_practice.TechMahindra_SuperCoder;

import java.util.HashMap;

public class Question9 {
    public static void main(String[] args) {
        String str="aabcsddbbeea";
        char[] charArr=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:charArr){
            if(map.containsKey(c)){
                map.put(c,(map.get(c)+1));
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
