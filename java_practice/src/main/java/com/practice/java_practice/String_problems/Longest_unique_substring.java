package com.practice.java_practice.String_problems;

import java.util.HashMap;

public class Longest_unique_substring {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int res=Find_longest_unique_substring(str);
        System.out.println(res);
    }

    private static int Find_longest_unique_substring(String str) {

        int left=0;
        int maxlength=0;
        HashMap<Character,Integer> charmap=new HashMap<>();
        for(int i=0;i<str.length();i++){


            if(charmap.containsKey(str.charAt(i)) && charmap.get(str.charAt(i))>=left){
                left=charmap.get(str.charAt(i))+1;
            }


            charmap.put(str.charAt(i),i);

            maxlength=Math.max(maxlength,(i-left)+1);


        }

        return maxlength;
    }
}
