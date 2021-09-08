/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;
import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int cur_age = Integer.parseInt(scan.nextLine());

        System.out.print("At what age would you like to retire? ");
        int retire_age = Integer.parseInt(scan.nextLine());

        int age_diff = retire_age - cur_age;
        int cur_year = Calendar.getInstance().get(Calendar.YEAR);
        int retire_year = cur_year + age_diff;

        System.out.println("You have " + age_diff + " years left until you can retire.");
        System.out.println("It's " + cur_year + ", so you can retire in " + retire_year + ".");
    }
}
