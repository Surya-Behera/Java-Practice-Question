package com.practice.java_practice.practiceQuestions_short;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstnum=sc.nextInt();
        System.out.println("Enter second number");
        int Secondnum=sc.nextInt();
      sc.nextLine();
        System.out.println("Enter operator");
        String op= sc.nextLine();
        if(op.equals("+")){
            System.out.println(firstnum+Secondnum);
        }
        if(op=="-"){
            System.out.println(firstnum-Secondnum);
        }
        if(op=="*"){
            System.out.println(firstnum*Secondnum);
        }
        if(op=="+"){
            System.out.println(firstnum/Secondnum);
        }

    }


}
