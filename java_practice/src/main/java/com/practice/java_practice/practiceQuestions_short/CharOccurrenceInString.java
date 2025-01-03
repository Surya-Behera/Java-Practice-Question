package com.practice.java_practice.practiceQuestions_short;

import java.util.HashMap;
import java.util.Scanner;

public class CharOccurrenceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through the string to count each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                charCountMap.put(ch, charCountMap.containsKey(ch) ? charCountMap.get(ch) + 1 : 1);
            }
        }

        // Display the results
        charCountMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
