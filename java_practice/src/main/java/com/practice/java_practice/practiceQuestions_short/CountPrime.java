package com.practice.java_practice.practiceQuestions_short;

public class CountPrime {
    public static void main(String[] args) {
     int num=254786135;
     int count=0;
     while (num>0){
         int r=num%10;
         if(isPrime(r)){
             count++;
         }
         num=num/10;
     }
        System.out.println(count);

    }
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i <=n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(count==0&&n>1){
            return true;
        }
        else return false;
    }

}
