package com.practice.java_practice.practiceQuestions_short;

public class Odd_character {
    public static void main(String[] args) {
        String name="Smitasujal";
        int l=name.length();
       for(int i=0;i<l;i++){
           if(i%2!=0) {
               System.out.println(name.charAt(i));
           }
       }
    }
}
