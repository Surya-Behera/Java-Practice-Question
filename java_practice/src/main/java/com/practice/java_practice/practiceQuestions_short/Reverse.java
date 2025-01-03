package com.practice.java_practice.practiceQuestions_short;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
//        for(int i=str.length()-1;i>=0;i--){
//            System.out.print(str.charAt(i));
//        }
       int i=0;
       int j=str.length()-1;
       while(i<j){
           char temp=ch[i];
           ch[i]=ch[j];
           ch[j]=temp;
           i++;
           j--;
       }
//       for(int k=0;k<ch.length;k++){
//           System.out.println(ch[k]);
//       }
        String result=new String(ch);
        System.out.println(ch);
    }
}
