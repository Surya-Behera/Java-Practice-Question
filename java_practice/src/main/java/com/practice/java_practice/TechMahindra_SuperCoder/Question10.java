package com.practice.java_practice.TechMahindra_SuperCoder;

public class Question10 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        String s3=new String("helo");
        String s4=new String("helo");

        System.out.println("s1 == s2 is:" +(s1==s2));
        System.out.println("s1 == s2 is:" + (s3==s4));


        System.out.println("s1 == s2 is:" + s1.equals(s2));
        System.out.println("s1 == s2 is:" + s3.equals(s4));
    }
}
