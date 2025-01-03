package com.practice.java_practice.practiceQuestion_long;

import java.util.Scanner;

public class SumOfpairs_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int N=sc.nextInt();
        int[] arr=new int[N];
        int even=0;
        int odd=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }

        //pair can possible out of N is N*N-1/2
        long evenpair= ((long)even*(even-1)/ 2);
        long oddpair=  (long)odd*(odd-1)/2;
        System.out.println("Number of even pair is"+evenpair);
        System.out.println("Number of odd pair is"+oddpair);
        long totalevensum=evenpair+oddpair;
        System.out.println("Number of total even sum pair is"+totalevensum);

        System.out.println(N*(N-1)/2);
    }
}
