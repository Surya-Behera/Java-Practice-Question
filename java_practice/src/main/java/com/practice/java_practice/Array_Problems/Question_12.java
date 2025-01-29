package com.practice.java_practice.Array_Problems;

import java.util.ArrayList;

public class Question_12 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int sum=6;
        ArrayList<Integer> idxes=Subset_sum(arr,sum);
        System.out.println(idxes);

    }


    //Context window O(n) time complexity expected method
    private static ArrayList<Integer> Subset_sum(int[] arr, int sum) {
        int s_idx=0;
        int e_idx=0;
        ArrayList<Integer> res=new ArrayList<>();
        int current=0;

            for(int i=0;i< arr.length;i++){
                current+=arr[i];

                  if(current>=sum){
                      e_idx=i;
                      while (current>sum && s_idx<e_idx){
                          current=current-arr[s_idx];

                      }
                  }
                  if(current==sum){
                      res.add(s_idx);
                      res.add(e_idx);
                      return res;
                  }


        }
            res.add(-1);
            return res;

    }

//    O(n2) time complexity
//    private static ArrayList<Integer> Subset_sum(int[] arr, int sum) {
//        ArrayList<Integer> res=new ArrayList<>();
//        int currentsum;
//        for(int i=0;i<arr.length;i++){
//            currentsum=0;
//            for(int j=i;j< arr.length;j++){
//                currentsum=currentsum+arr[j];
//                if(currentsum==sum){
//                    res.add(i);
//                    res.add(j);
//                    return res;
//                }
//            }
//
//        }
//        res.add(-1);
//        return res ;
//    }
}
