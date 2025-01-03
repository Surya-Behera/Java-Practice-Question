/*Problem Statement –

Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

Constrains-

1<=N<=100

Example 1:

Input :

10  -> Integer

Output :

5    -> result- Integer

Explanation:

Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.
*/
package com.practice.java_practice.Previous_nqt;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=Togglebitsum(n);
        System.out.println(result);
    }

    private static int Togglebitsum(int n) {
        int pos=0;
        int sum=0;
        while (n>0){
            int bit=n%2;
            bit=bit==0?1:0;
            sum= (int) (sum+(bit*Math.pow(2,pos)));
            n=n/2;
            pos++;
        }
        return sum;
    }
}
