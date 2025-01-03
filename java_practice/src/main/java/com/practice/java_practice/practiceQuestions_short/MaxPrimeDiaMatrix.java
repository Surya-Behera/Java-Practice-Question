package com.practice.java_practice.practiceQuestions_short;

import java.util.Scanner;

public class MaxPrimeDiaMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r;
        int c;
        System.out.println("Enter number of row: ");
        r=sc.nextInt();
        System.out.println("Enter number of coloumn: ");
        c=sc.nextInt();
        int result=r+c;
        int[] diagonalElements=new int[result];
        int[] primeArray=new int[5];
        int k=0;
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.println("Enter"+(i+1)+"Element:");
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(i==j){
                    System.out.println("The diagonal elements are :"+ arr[i][j]);
                    diagonalElements[k]=arr[i][j];
                    k++;
                }
            }
        }

        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if((i + j )== (r-1)){
                    System.out.println("The diagonal elements are :"+ arr[i][j]);
                    diagonalElements[k]=arr[i][j];
                    k++;
                }
            }
        }

        System.out.println("The diagonal array is ");
        for(int i=0;i<result;i++){
            System.out.print(diagonalElements[i]);
            System.out.print(" ");
        }

        int max=0;
        System.out.println("The prime diagonal array is ");
        for (int i=0;i<diagonalElements.length;i++) {
            if (IsPrime(diagonalElements[i])) {
                System.out.println(diagonalElements[i]);
                if(diagonalElements[i]>max){
                    max=diagonalElements[i];
                }
            }
        }
        System.out.println("The heighest prime element is "+max);
    }

    public static boolean IsPrime(int num){
        if(num==1) return false;
        if(num%2==0) return false;
        for(int i=3;i<=num/2;i++ ){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
