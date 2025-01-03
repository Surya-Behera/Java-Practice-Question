package com.practice.java_practice.String_problems;

import java.util.Scanner;

public class remove_specific_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String ch= sc.nextLine();
        String newword=str.replace(ch,"");
        for(int i=0;i<newword.length();i++){
            System.out.print(newword.charAt(i)+" ");
        }
    }
}
