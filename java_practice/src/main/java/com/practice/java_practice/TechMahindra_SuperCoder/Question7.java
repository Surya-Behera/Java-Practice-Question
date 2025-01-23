package com.practice.java_practice.TechMahindra_SuperCoder;

import java.util.HashSet;

public class Question7 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,1,2};
        int[] arr2={1,2,3};
        int[] arr3={1,2,3,4};
        boolean result=CompareArry(arr1,arr2);
        boolean result2=CompareArry(arr1,arr3);
        System.out.println(result);
        System.out.println(result2);
    }
    public static boolean CompareArry(int[] arr1,int[] arr2){
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int ele:arr1){
            set1.add(ele);
        }



        for(int ele:arr2){
            set2.add(ele);
        }

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);


        return set1.equals(set2);
    }
}
