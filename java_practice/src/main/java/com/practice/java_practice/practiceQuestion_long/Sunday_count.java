package com.practice.java_practice.practiceQuestion_long;

import java.util.Objects;
import java.util.Scanner;

public class Sunday_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total_days=sc.nextInt();
        sc.nextLine();
        String dayname=sc.nextLine();
        int days_left_fisrtSunday=0;
        int count=0;

        if(Objects.equals(dayname, "sun")) count=1;
        else if(Objects.equals(dayname, "mon")) days_left_fisrtSunday=6;
        else if(Objects.equals(dayname, "tue")) days_left_fisrtSunday=5;
        else if(Objects.equals(dayname, "wed")) days_left_fisrtSunday=4;
        else if(Objects.equals(dayname, "thu")) days_left_fisrtSunday=3;
        else if(Objects.equals(dayname, "fri")) days_left_fisrtSunday=3;
        else if(Objects.equals(dayname, "sat")) days_left_fisrtSunday=1;
        if(total_days>days_left_fisrtSunday){
            total_days=total_days-days_left_fisrtSunday;
            count++;
        }
        else {
            System.out.println("No sunday available");
        }
      int result=total_days/7;
        count=count+result;
        System.out.println(count);

    }
}
