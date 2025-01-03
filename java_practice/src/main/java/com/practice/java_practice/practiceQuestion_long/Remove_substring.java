package com.practice.java_practice.practiceQuestion_long;

import java.util.Scanner;

public class Remove_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        String resultString="";
        for(int i=0;i<l;i++){
        resultString+=str.charAt(i);
        if(resultString.length()>=3){
            if(resultString.charAt(resultString.length()-3)=='A'
            && resultString.charAt(resultString.length()-2)=='W'
            && resultString.charAt(resultString.length()-1)=='S'){
             resultString=resultString.substring(0,resultString.length()-3); //Pop 3 elements
            }
        }
        }
        System.out.println(resultString);
    }
}
