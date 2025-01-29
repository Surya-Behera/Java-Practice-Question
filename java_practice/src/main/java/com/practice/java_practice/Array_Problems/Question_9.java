package com.practice.java_practice.Array_Problems;

//Move all zero to last of the array
public class Question_9 {
    public static void main(String[] args) {
        int[] arr={1,2,0,2,3,0,5,0};


//        This is the Recommended method
//        int c=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                int temp=arr[i];
//                arr[i]=arr[c];
//                arr[c]=temp;
//                c++;
//            }
//        }


        //Another Method
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count< arr.length){
            arr[count++]=0;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
