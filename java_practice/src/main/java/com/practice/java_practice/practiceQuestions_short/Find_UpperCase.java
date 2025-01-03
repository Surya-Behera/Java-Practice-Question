package com.practice.java_practice.practiceQuestions_short;

import java.util.Scanner;

public class Find_UpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="The quick Brown Fox jumps over the Lazy dog";
        String str1="Tqhbcsde";
        String[] strarr=str.split(" ");
        for (int i=0;i<strarr.length;i++){
           if(strarr[i].charAt(0)>='A'&& strarr[i].charAt(0)<='Z'){
               System.out.println(strarr[i]);
           }
        }
        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));
        }
        System.out.println(shortform(str));
    }
    public static String shortform(String str){
        String result="";
        String[] ch=str.split(" ");
        for (int i=0;i<ch.length;i++){
            result=result+(ch[i].charAt(0));

        }
       return  result;

    }
}
