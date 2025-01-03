package com.practice.java_practice.practiceQuestion_long;

import java.util.Scanner;

public class Fine_collection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];

        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int date= sc.nextInt();
        int X=sc.nextInt();
        int finesum=0;

        for(int i=0;i<N;i++){
                if(arr[i]%2==0 && date%2!=0){
                    finesum++;
                } else if (arr[i]%2!=0 && date%2==0) {
                    finesum++;
                }

        }
        int total_fine=finesum*X;
        System.out.println(total_fine);
    }
}
