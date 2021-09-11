package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String name; //Declare input value (aka the users name)
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?"); //Ask the user a question

        name = sc.next(); //Scan in the users name

        System.out.println("Hello, " + name + ", nice to meet you!"); //print out the users name, as well as a message

        sc.close(); //close the scan variable
    }
}
