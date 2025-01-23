package com.practice.java_practice.TechMahindra_SuperCoder;

public class Question6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int low=0;
        int high=arr.length-1;
        int key=3;
        int keyindex=BinarySearch(arr,low,high,key);
        System.out.println(keyindex);
    }
    private  static int BinarySearch(int[] arr,int low,int high,int key){

        while(low<=high){
            int mid=(low+high)/2;
            if(key<arr[mid]){
                high=mid-1;
            } else if (key==arr[mid]) {
                return mid;
            }
            else low=mid+1;

        }
        return -1;
    }

}
