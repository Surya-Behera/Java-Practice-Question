package com.practice.java_practice.practiceQuestion_long;

import java.util.Arrays;
import java.util.Scanner;

public class Move_Zeros_last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }


        int newIndex=0;
        int[] newarry=new int[N];
        for(int i=0;i<N;i++){
            if(arr[i]==0){
                newarry[newIndex]=arr[i];
                newIndex++;
            }
        }
        for(int i=0;i<N;i++){
            if(arr[i]!=0){
                newarry[newIndex]=arr[i];
                newIndex++;
            }
        }
        for (int i=0;i<N;i++){
            System.out.print(newarry[i]+" ");
        }


//        Arrays.sort(arr);
//        for(int i=N-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
    }
}
