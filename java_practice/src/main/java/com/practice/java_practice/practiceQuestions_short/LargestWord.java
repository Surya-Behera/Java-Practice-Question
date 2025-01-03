package com.practice.java_practice.practiceQuestions_short;
import  java.util.*;

public class LargestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] strArr=sentence.split((" "));
        String maxword="";

        //Largest word in a String
        for(int i=0;i<strArr.length;i++){
            int length=strArr[i].length();
            if(length>maxword.length()){
                maxword=strArr[i];
            }
        }
        System.out.println(maxword);

        //Last letter of each word of a String
        for(int i=0;i<strArr.length;i++){
            String word=strArr[i];
            int length=strArr[i].length();
            System.out.print(word.charAt(length-1));

        }
        System.out.println();

        //First letter of each word of a String
        for(int i=0;i<strArr.length;i++){
            String word=strArr[i];
            System.out.print(word.charAt(0));
        }
    }
}
