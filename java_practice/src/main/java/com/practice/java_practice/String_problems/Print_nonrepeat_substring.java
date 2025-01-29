package com.practice.java_practice.String_problems;

import java.util.HashMap;

public class Print_nonrepeat_substring {
    public static void main(String[] args) {
        String input1 = "GEEKSFORGEEKS";
        String input2 = "ABDEFGABEF";

        System.out.println("Input: " + input1);
        System.out.println("Output: " + findLongestSubstring(input1));

        System.out.println("\nInput: " + input2);
        System.out.println("Output: " + findLongestSubstring(input2));
    }

    private static String findLongestSubstring(String s) {
        if(s==null||s.isEmpty())return "";

        HashMap<Character,Integer> charIndex=new HashMap<>();

        int maxlength=0;
        int maxStart=0;
        int start=0;

        for(int end=0;end<s.length();end++){
            char currentchar=s.charAt(end);

            if(charIndex.containsKey(currentchar) && charIndex.get(currentchar)>=start){
                start=charIndex.get(currentchar)+1;
            }

            charIndex.put(currentchar,end);

            int currentlen=end-start+1;

            if(currentlen>maxlength){
                maxlength=currentlen;
                maxStart=start;
            }
        }
        return s.substring(maxStart,maxStart+maxlength);
    }
}
