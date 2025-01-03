
/*Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends.

So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

 Example 1:

Input

mon-> input String denoting the start of the month.

13  -> input integer denoting the number of days from the start of the month.

Output :

2    -> number of days within 13 days.

Explanation:

The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.

Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days.

 */

package com.practice.java_practice.Previous_nqt;

import java.util.Objects;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();
        int day_remain_month=sc.nextInt();
        int day_left_for_first_sunday=0;
//        if(Objects.equals(day, "Sun"))day_left_for_first_sunday=0;
//        if(Objects.equals(day, "Mon"))day_left_for_first_sunday=6;
//        if(Objects.equals(day, "Tue"))day_left_for_first_sunday=5;
//        if(Objects.equals(day, "Wed"))day_left_for_first_sunday=4;
//        if(Objects.equals(day, "Thu"))day_left_for_first_sunday=3;
//        if(Objects.equals(day, "Fri"))day_left_for_first_sunday=2;
//        if(Objects.equals(day, "Sat"))day_left_for_first_sunday=1;

        String[] weekdays={"Mon","Tue","wed","Thu","Fri","Sat"};
        for(int i=0;i<weekdays.length;i++){
            if(weekdays[i].equals(day)){
                day_left_for_first_sunday=6-i;
                break;
            }

        }
        System.out.println(day_left_for_first_sunday);

        int count=1;
        //Edge Case
        if(day_left_for_first_sunday>day_remain_month){
            System.out.println("No sunday available");
            count=0;
        }

        int total_day_except_first_sunday=day_remain_month-day_left_for_first_sunday;
        int sunday_count=count+total_day_except_first_sunday/7;
        System.out.println(sunday_count);

    }
}
