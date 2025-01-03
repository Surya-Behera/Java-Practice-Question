package com.practice.java_practice.practiceQuestions_short;

public class NoWordsinString {
    public static void main(String[] args) {
        String str="alyani eoverment  Engineering College";
        String[] ch=str.split(" ");
        int len=ch.length;
        System.out.println(len);
        int count=0;
        for(int i=0;i<len;i++){
            if(ch[i]!=""){
                if(ch[i].charAt(i)=='a'||ch[i].charAt(i)=='e'){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
