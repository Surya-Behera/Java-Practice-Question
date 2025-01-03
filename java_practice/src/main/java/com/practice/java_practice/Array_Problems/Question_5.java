/*John is a geologist, and he needs to count rock samples in order to send it to a chemical laboratory. He has a problem. The laboratory only accepts rock samples by a range of sizes in ppm (parts per million). John needs your help. Your task is to develop a program to get the number of rocks in each range accepted by the laboratory.

Problem Statement: Given an array samples[] denoting sizes of rock samples and a 2D array ranges[], the task is to count the rock samples that are in the range ranges[i][0] to ranges[i][1], for every possible 1 <= i <= N.

Examples:


Input: samples[] = {345, 604, 321, 433, 704, 470, 808, 718, 517, 811}, ranges[] = {{300, 380}, {400, 700}}
Output: 2 4
Explanation:
Range [300, 380]: Samples {345, 321} lie in the range. Therefore, the count is 2.
Range [400, 700]: Samples {433, 604, 517, 470} lie in the range. Therefore, the count is 4.


Input: samples[] = {400, 567, 890, 765, 987}, ranges[] = {{300, 380}, {800, 1000}
Output: 0 2



 */



package com.practice.java_practice.Array_Problems;

public class Question_5 {
    public static void main(String[] args) {
       int samples[] = {345, 604, 321, 433, 704, 470, 808, 718, 517, 811};
       int ranges[][] = {{300, 380}, {400, 700}};
       for(int i=0;i< ranges.length;i++){
               int start=ranges[i][0];
               int end=ranges[i][1];
               int count=0;
               for(int j=0;j<samples.length;j++){
                   if(start<samples[j] && samples[j]<end){
                       count++;
                   }
               }
           System.out.println(count);
       }
    }
}
