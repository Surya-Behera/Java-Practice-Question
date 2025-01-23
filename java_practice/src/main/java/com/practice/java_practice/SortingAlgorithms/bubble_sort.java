package com.practice.java_practice.SortingAlgorithms;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={21,32,34,4,39,45};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        Bubble_Sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void Bubble_Sorting(int[] arr) {
        int n=arr.length;
        int i,j,temp;
        boolean swapped;

        for(i=0;i<n;i++){
            swapped=false;
            for(j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;;
        }
    }
}
