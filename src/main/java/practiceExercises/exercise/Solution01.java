/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Cole Castille
 */

package practiceExercises.exercise;

import java.util.Scanner;

// prompt "What is your name?" to user
// scan input from user as string
// read string input
// print "Hello, <input>, nice to meet you!"

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + ", nice to meet you!");
    }
}
