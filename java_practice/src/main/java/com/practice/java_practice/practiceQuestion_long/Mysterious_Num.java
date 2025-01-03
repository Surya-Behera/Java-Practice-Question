package com.practice.java_practice.practiceQuestion_long;

import java.util.Scanner;

public class Mysterious_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int R=sc.nextInt();
        int sum=0;
        while (N > 0) {
            int r=N%10;
            sum=sum+r;
            N=N/10;
        }
        System.out.println(sum);
        int result=0;
        int sum_after=sum*R;
        System.out.println(sum_after);
        while (sum_after>0){
            int r=sum_after%10;
            result+=r;
            sum_after=sum_after/10;
        }
        System.out.println(result);
    }


}
