package com.practice.java_practice.practiceQuestions_short;

import java.util.Scanner;

public class Odd_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reversenum=0;

        if(num%2!=0){
            while(num>0){
                int r=num%10;
                reversenum=reversenum*10+r;
                num=num/10;

            }
            System.out.println("Reverse number is :"+reversenum);
        }
        else {
            System.out.println("Can not reverse");
        }
    }
}
