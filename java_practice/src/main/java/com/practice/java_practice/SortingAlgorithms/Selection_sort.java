package com.practice.java_practice.SortingAlgorithms;
//selection sort
public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={21,32,34,4,39,45};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        Selection_Sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void Selection_Sorting(int[] arr) {
        int n=arr.length;
        int min_idx;
        for(int i=0;i<n;i++){
            min_idx=i;
            for (int j=i+1;j<n;j++){
                if(arr[min_idx]>arr[j]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;

        }
    }
}
