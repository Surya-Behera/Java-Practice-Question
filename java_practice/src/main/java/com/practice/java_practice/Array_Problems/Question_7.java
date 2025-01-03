/*Given an array and a key, the task is to remove all occurrences of the specified key from the array in Java.

Examples to Remove Elements Occurrences in Array
Input: array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }, key = 3
Output: [9, 2, 1, 7, 2, 5]

Input: array = { 10, 20, 10, 30, 50, 10 }, key = 10
Output: [20, 30, 50]

 */



package com.practice.java_practice.Array_Problems;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ele=sc.nextInt();

        int idx=0;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=ele){
               result[idx++]=arr[i];
            }
        }
        for(int i=0;i<idx;i++){
            System.out.print(result[i]+" ");
        }
    }
}
