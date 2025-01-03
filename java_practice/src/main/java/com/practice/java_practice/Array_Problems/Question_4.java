/*Two pairs (a, b) and (c, d) are said to be symmetric if c is equal to b and a is equal to d. For example, (10, 20) and (20, 10) are symmetric. Given an array of pairs find all symmetric pairs in it.
It may be assumed that the first elements of all pairs are distinct.
Example:

Input: arr[] = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}}
Output: Following pairs have symmetric pairs
        (30, 40)
        (5, 10)

 */


package com.practice.java_practice.Array_Problems;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][2];
        for (int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Following pairs have symmetric pairs\n");
        findSymPairs(arr);

    }

    private static void findSymPairs(int[][] arr) {
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
                    System.out.print("(");
                    System.out.print(arr[i][0]);
                    System.out.print(", ");
                    System.out.print(arr[i][1]);
                    System.out.print(")");
                    System.out.print("\n");
                }

            }

        }
    }
}
