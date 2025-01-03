

//"Count the number of elements in an array that are greater than all the elements that came before them."

package com.practice.java_practice.practiceQuestion_long;

import java.util.Scanner;

public class Count_graterelemt_of_prior {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
//        int count=1;
//        for(int i=1;i<N;i++){
//            boolean grater=false;
//            for(int j=0;j<i;j++){
//                if(arr[i]>arr[j]){
//                    grater=true;
//                }
//                else grater=false;
//            }
//            if(grater){
//                count++;
//            }
//        }
//        ANOTHER METHOD

        int count=0;
        int max=0;
        for(int i=0;i<N;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
