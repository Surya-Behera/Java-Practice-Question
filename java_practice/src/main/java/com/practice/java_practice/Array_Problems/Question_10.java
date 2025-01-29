package com.practice.java_practice.Array_Problems;
//Reverse an Array of the specific index;
public class Question_10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int d=3;
        LeftRotate(arr,d);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    private static void LeftRotate(int[] arr, int d) {

        int n=arr.length;
                if(d==0)
                    return;
             ReverseArray(arr,0,d-1);
             ReverseArray(arr,d,n-1);
             ReverseArray(arr,0,n-1);

    }

    private static void ReverseArray(int[] arr, int i, int i1) {
        int temp;
        while (i<i1){
            temp=arr[i];
            arr[i]=arr[i1];
            arr[i1]=temp;
            i++;
            i1--;
        }
    }
}
