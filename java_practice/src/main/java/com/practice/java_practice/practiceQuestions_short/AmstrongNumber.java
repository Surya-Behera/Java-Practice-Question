package com.practice.java_practice.practiceQuestions_short;
public class AmstrongNumber {
    public  static void main(String args[]){
        int num=153;
       String result= CheckAmstrong(num);
        System.out.println(result);

    }
    public static String CheckAmstrong(int num){
        int realnum=num;
        int sum=0;
        int r;
        while(num>0){
            r=num%10;
            System.out.println(r);
            sum+=r*r*r;
            num=num/10;
        }
        System.out.println(sum);
        if(sum==realnum){
            return ("Yes");
        }
        else {
            return ("No");
        }

    }
}
