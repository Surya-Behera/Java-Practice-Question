//Write a program to return the difference count between odd and even number of and array



package com.practice.java_practice.TechMahindra_SuperCoder;
import java.util.*;

public class Question1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int res=countOddEvenDifference(arr,size);
        System.out.print(res);

    }

    public static int countOddEvenDifference(int[] arr,int size){
        int Oddcount=0;
        int Evencount=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                Evencount++;
            }
            else Oddcount++;
        }
        int dif=Oddcount-Evencount;
        return dif;
    }

}
