package com.practice.java_practice.TechMahindra_SuperCoder;

import java.util.Scanner;

// Prime number check
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = CheckPrime(num);

        if (prime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }

    private static boolean CheckPrime(int num) {
        // Special case: numbers less than 2 are not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(num) (optimizing the range)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true; // Prime if no divisors are found
    }
}
