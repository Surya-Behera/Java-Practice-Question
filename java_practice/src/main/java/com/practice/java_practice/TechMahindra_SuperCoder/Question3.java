package com.practice.java_practice.TechMahindra_SuperCoder;

import java.util.Scanner;

//febonaci series using recursion
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fablength=sc.nextInt();
        for(int i=0;i<=fablength;i++){
            System.out.print(fabonicseries(i)+" ");
        }
    }

    private static int fabonicseries(int num) {
        if(num<=1)
            return num;
        return fabonicseries(num-1)+fabonicseries(num-2);

    }
}
