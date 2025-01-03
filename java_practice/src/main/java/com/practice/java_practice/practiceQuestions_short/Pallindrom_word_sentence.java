//Pallindrome word present in a sentence.


package com.practice.java_practice.practiceQuestions_short;
import  java.util.*;
public class Pallindrom_word_sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String word="MADM";
        String[] strArray=sentence.split(" ");
        for(int i=0;i< strArray.length;i++){
            if(Ispallindrom(strArray[i])){
                System.out.println("This is pallindrom array :"+strArray[i]);
            }
        }
        if(Ispallindrome(word)){
            System.out.println("pallindrom word");
        }
        else {
            System.out.println("Not Pallindrome");
        }
    }

    private static boolean Ispallindrom(String str) {
        char[] charArry=str.toCharArray();
        int length=str.length();
        int i=0;
        int j=length-1;
        while(i<j){
            char ch=charArry[i];
            charArry[i]=charArry[j];
            charArry[j]=ch;
            i++;
            j--;
        }
        String generateString=new String(charArry);
        if(str.equals(generateString)){
            return true;
        }
        else return false;
    }
    public static boolean Ispallindrome(String str){
        int i=0;
        int j=str.length();
        boolean result=false;
        while(i<j){
            if(str.charAt(i)==str.charAt(j-1)){
                result=true;
            }
            else {
                result=false;
                break;
            }
            i++;
            j--;
        }
      return result;
    }
}
