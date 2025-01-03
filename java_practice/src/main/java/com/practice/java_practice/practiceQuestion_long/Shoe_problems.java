package com.practice.java_practice.practiceQuestion_long;

import java.util.Scanner;

public class Shoe_problems {
    public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int sum=0;
            int[] arr = {2,2,5,4};

            while(arr.length>0){
                System.out.println("enter the shoe no.");
                int n=sc.nextInt();
                System.out.println("enter the amount");
                int money=sc.nextInt();
                int newArray[]=new int[arr.length-1];
                boolean found=false;
                int index=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==n && !found){
                        found=true;
                    }
                    else{
                        if (index < newArray.length) {
                            newArray[index++] = arr[j];
                        }
                    }
                }
                if(found){
                    arr=newArray;
                    sum+=money;

                }
                else{
                    System.out.println("not found");
                }

            }
            System.out.println("total is sum"+sum);
        }
    }
