package com.practice.java_practice.TechMahindra_SuperCoder;

public class Question8 {
    public static void main(String[] args) {
        int[] arr={99,77,45,76,98,05};
        int secondheighest=Secondheighest(arr);
        System.out.println(secondheighest);
    }

    private static int Secondheighest(int[] arr) {
       int first_heighest=Integer.MIN_VALUE;
       int second_heighest=Integer.MIN_VALUE;

       for(int i:arr){
           if(i>first_heighest){
               second_heighest=first_heighest;
               first_heighest=i;
           } else if (i>second_heighest) {
               second_heighest=i;

           }
       }
       return second_heighest;

    }
}
