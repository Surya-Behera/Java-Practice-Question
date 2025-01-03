package com.practice.java_practice.practiceQuestions_short;

import java.util.Arrays;
import java.util.Scanner;

public class Large_Small {
    public static void main(String[] args) {
        int maximum=0;
        int min=Integer.MAX_VALUE;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter integer"+(i+1)+":");
            arr[i]= sc.nextInt();
        }

//        for(int i=0;i<length;i++){
//            if(arr[i]>maximum){
//                maximum=arr[i];
//            }
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
        Arrays.sort(arr);
        System.out.println("Smallest integer"+arr[0]);
        System.out.println("largest integer"+arr[length-1]);

    }
}
