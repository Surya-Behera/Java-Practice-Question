package com.practice.java_practice.String_problems;

import java.util.Scanner;

public class SortStrings {
    public static void main(String[] input)
    {
        int i, j,n,c=1;
        String temp;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no. of Strings u want to Sort : ");
        n=scan.nextInt();

        String names[] = new String[n];

        System.out.println("Enter "+ n + " Strings : \n");
        for(i=0; i<n; i++)
        {
            System.out.print("Enter " + c + " String : ");
            names[i] = scan.next();
            c++;
        }


        System.out.println("\nSorting Strings in Alphabetical Order...\n");
        for(i=0; i<n; i++)
        {
            for(j=1; j<n; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }

        for(i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
}
