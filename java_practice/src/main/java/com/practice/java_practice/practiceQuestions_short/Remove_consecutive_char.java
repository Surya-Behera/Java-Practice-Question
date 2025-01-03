package com.practice.java_practice.practiceQuestions_short;

import java.util.Scanner;

public class Remove_consecutive_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=sc.nextLine();
        int len=word.length();
        char ch=' ';
        String str="";
        for(int i=0;i<len;i++){
            if(word.charAt(i)!=ch){
                ch=word.charAt(i);
                str+=ch;
            }
        }
        System.out.println(str);

    }
}
