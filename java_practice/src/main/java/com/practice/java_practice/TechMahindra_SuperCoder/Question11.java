package com.practice.java_practice.TechMahindra_SuperCoder;

import java.util.HashSet;

public class Question11 {
    public static void main(String[] args) {
        String s3 = "JournalDev";
        int start = 1;
        char end = 5;

        System.out.println(s3.substring(start, end));

        HashSet shortSet = new HashSet();

        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }

        System.out.println(shortSet.size());
    }
}
