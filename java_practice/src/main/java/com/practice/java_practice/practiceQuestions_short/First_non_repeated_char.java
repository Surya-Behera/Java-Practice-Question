package com.practice.java_practice.practiceQuestions_short;

public class First_non_repeated_char {
    public static void main(String[] args) {
        String str = "accvbacd";

        for (int i = 0; i<str.length(); i++) {
            boolean is_repeated = false;
            char ch = str.charAt(i);
            for (int j=0; j<str.length(); j++) {
                if (str.charAt(j) == ch &&(i!=j)) {
                    is_repeated = true;
                }

            }
            if(!is_repeated){
                System.out.println(ch);
                break;
            }

        }


    }
}
