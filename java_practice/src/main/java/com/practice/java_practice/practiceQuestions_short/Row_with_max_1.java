package com.practice.java_practice.practiceQuestions_short;

import java.util.Scanner;

public class Row_with_max_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int row=-1;
        int max=0;
        int count=0;
        for(int i=0;i<n;i++){
             count=0;
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }

            if(count>max){
                max=count;
                row=i;
            }
        }
        System.out.println("The row "+row+" contains "+max+" no.s of one");

    }
}
