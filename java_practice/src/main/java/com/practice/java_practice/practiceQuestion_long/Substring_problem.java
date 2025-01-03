package com.practice.java_practice.practiceQuestion_long;

import java.util.Scanner;

public class Substring_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int L=sc.nextInt();
        int lngth=str.length();
        int max_a=0;
        for(int i=0;i<lngth;i=i+L){
            int a=0;
            String set=str.substring(i,Math.min(i+L,lngth));
            for(int j=0;j<set.length();j++){
                if(set.charAt(j)=='a'){
                    a++;
                }
            }

            if(max_a<a){
                max_a=a;
            }
        }
        System.out.println(max_a);
    }
}
