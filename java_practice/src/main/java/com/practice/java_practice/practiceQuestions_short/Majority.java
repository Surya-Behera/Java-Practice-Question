package com.practice.java_practice.practiceQuestions_short;

import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length :");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter "+(i+1)+"element :");
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>length/2){
                System.out.println(arr[i]);
                break;
            }
            count=0;
        }
        if(count<=length/2){
            System.out.println("No measure element found");
        }
    }
}
