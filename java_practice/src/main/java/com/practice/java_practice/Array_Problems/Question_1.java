/*Given an array of integers of size N, the task is to find the first non-repeating element in this array.

Examples:


Input: {-1, 2, -1, 3, 0}
Output: 2
Explanation: The first number that does not repeat is : 2


Input: {9, 4, 9, 6, 7, 4}
Output: 6



 */


package com.practice.java_practice.Array_Problems;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean visit=true;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]&& i!=j){
                    visit=false;
                }
            }
            if(visit){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
