/*Given an unsorted array of integers, print the array after removing the duplicate elements from it. We need to print distinct array elements according to their first occurrence.

Examples:

Input : arr[] = { 1, 2, 5, 1, 7, 2, 4, 2}
Output : 1 2 5 7 4
Explanation : {1, 2} appear more than one time.

 */

package com.practice.java_practice.Array_Problems;

import java.util.HashMap;
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> HashArray=new HashMap<>();

        for(int i=0;i<n;i++){
            HashArray.put(arr[i],HashArray.containsKey(arr[i])?HashArray.get(arr[i])+1:1);
        }

        HashArray.forEach((key,value) -> System.out.print(key + " "));

    }
}
