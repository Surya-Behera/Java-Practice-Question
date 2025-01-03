package com.practice.java_practice.practiceQuestions_short;

public class Repeatedcharactercount {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the repeated character string");
//        String str=sc.nextLine();
        String str="aabbcde";
        int length= str.length();
        char ch=str.charAt(0);
        int count=0;
        for(int k=0;k<length;k++){
            if(ch==str.charAt(k)){
                count++;
            }
            else {
                System.out.print(ch+""+count);
                ch=str.charAt(k);
                k--;
                count=0;
            }
            if((k==str.length()-1)&& ch==str.charAt(k)){
                System.out.println(ch+""+count);
            }
        }
    }
}
