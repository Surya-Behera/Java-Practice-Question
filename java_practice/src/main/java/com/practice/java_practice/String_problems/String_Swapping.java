package com.practice.java_practice.String_problems;

public class String_Swapping {
    public static void main(String[] args) {
        String str1="abcd";
      String  str3 = str1.replaceAll("[aeiouAEIOU]", "");
      System.out.println(str3);
        String str2="aaef";
        if(str1.compareTo(str2)>0){   //str1 comes after str2
            System.out.println("str2 is grater");
        }

        else{
            System.out.println("str1 is grater");
        }
        str1=str1+str2;
        System.out.println(str1);
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);
    }
}
