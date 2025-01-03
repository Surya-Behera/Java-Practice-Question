package com.practice.java_practice.practiceQuestion_long;
import  java.util.*;
public  class Remainders_multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int price=1;
        while(N>0){
            int r=N%10;
            price=price*r;
            N=N/10;
        }
        System.out.println(price);
    }
}
