package com.practice.java_practice.practiceQuestions_short;

public class NonrepeatedString {
    public static void main(String[] args) {
        String str = "Arijjit";
       String result="";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isRepeated = true; // Found a repetition
                    break;
                }
            }

            if (!isRepeated) {
                result+=current;
            } else {
                break; // Stop when a repeated character is found
            }
        }

        System.out.println("Non-repeated substring: " + result);
    }
}
