/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboardInput =  new Scanner(System.in);
        System.out.print("What is your current age? ");
        int num1 = keyboardInput.nextInt();

        System.out.print("At what age would you like to retire? ");
        int num2 = keyboardInput.nextInt();

        Date data = new Date();
        int year = data.getYear();
        year = year + 1900;


        System.out.println("You have " + (num2 - num1) + " years left until you can retire." );

        System.out.println("It's " + year + ", so you can retire in " + (year + (num2 - num1)) + "." );
    }
}
