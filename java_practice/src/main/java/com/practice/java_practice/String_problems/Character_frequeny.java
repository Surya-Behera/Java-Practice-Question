package com.practice.java_practice.String_problems;

import java.util.Scanner;

public class Character_frequeny {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String chr= sc.nextLine();
        int charcount=str.length()-str.replace(chr,"").length();
        System.out.println(chr +" "+charcount);

        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            char ch=str.charAt(i);
            System.out.println(ch +"  "+count);
        }
    }
}
