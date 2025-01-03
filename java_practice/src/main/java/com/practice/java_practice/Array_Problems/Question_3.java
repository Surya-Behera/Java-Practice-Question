/*Given an array arr[] of size n, return an equilibrium index (if any) or -1 if no equilibrium index exists. The equilibrium index of an array is an index such that the sum of elements at lower indexes equals the sum of elements at higher indexes.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.

Examples:

Input: arr[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 4
Explanation: In 1-based indexing, 4 is an equilibrium index, because: arr[1] + arr[2] + arr[3] = arr[5] + arr[6] + arr[7]


Input: arr[] = {1, 2, 3}
Output: -1
Explanation: There is no equilibrium index in the array.



 */

package com.practice.java_practice.Array_Problems;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result=EquilibriumElenem(arr);
        System.out.println(result);

    }

    private static int EquilibriumElenem(int[] arr) {
        int l=arr.length;
        int[] prefix=new int[l];
        int[] suffix=new int[l];
        prefix[0]=arr[0];
        for(int i=1;i<l;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        suffix[l-1]=arr[l-1];
        for(int i=l-2;i>=0;i--){
            suffix[i]=suffix[i+1]+arr[i];
        }
        for(int i=0;i<l;i++){
            if(prefix[i]==suffix[i]){
                return i+1;
            }
        }
        return -1;
    }
}
