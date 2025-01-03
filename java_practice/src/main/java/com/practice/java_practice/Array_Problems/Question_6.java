/*Given an array which may contain duplicates, print all elements and their frequencies.

Examples:

Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1

Input : arr[] = {10, 20, 20}
Output : 10 1
         20 2

 */



package com.practice.java_practice.Array_Problems;

import java.util.HashMap;
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr=new int[l];
        for(int i=0;i<l;i++){
            arr[i]= sc.nextInt();
        }
        HashMap<Integer,Integer> Maparr=new HashMap<>();

        for(int i=0;i<l;i++){
                int ele=arr[i];
                Maparr.put(ele,Maparr.containsKey(ele)?Maparr.get(ele)+1:1);
            }

        Maparr.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
