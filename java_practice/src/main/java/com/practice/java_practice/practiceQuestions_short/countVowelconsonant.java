package com.practice.java_practice.practiceQuestions_short;

public class countVowelconsonant {
    public static void main(String[] args) {
        String str="aebc21d dd";
        int v=0;
        int c=0;
        int s=0;
        int num=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                v++;
            }
            else if(Character.isDigit(str.charAt(i))){
                num++;
            } else if (str.charAt(i)==' ') {
                s++;
            } else c++;
        }
        System.out.println("vowel="+v+" Consonat="+c+" number="+num +" space "+s);

    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        else return false;
    }
}
