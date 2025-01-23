package com.practice.java_practice.TechMahindra_SuperCoder;
import java.util.*;
public class Question4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        String rev=reverse(str);


//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        System.out.println(str1 == str2);//false because both refer to different location in memory
//        System.out.println(str1.equals(str2));//True because the content of two string is same
//
//        String str3="hello";
//        String str4="hello";
//        System.out.println(str3==str4);  //true because here we are using string literal so both variable refer to same value in String pool
//

        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("This is a pallindrom string");
        }
        else{
            System.out.println("Not a pallindrom String");
        }

    }
    public static  String reverse(String str){

    char[] charArray=str.toCharArray();


//        String[] charArray=str.split("");
        int j=charArray.length-1;
        int i=0;
        while(i<j){
            char temp=charArray[i];
//            String temp=charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=temp;
            i++;
            j--;
        }
//        return String.join("",charArray);
        return new String(charArray);
    }
}
