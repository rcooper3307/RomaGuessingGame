package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int computerGuess = (int) (Math.random() * 10 + 1);
        System.out.print("I want you to guess my secret number! It's between one and ten!");
        Scanner input = new Scanner(System.in);
        while((input.nextDouble() != computerGuess)) {
            System.out.print("Guess again, dummy! Remember, from 1-10");
        }
        System.out.println("You got it! The secret number was "+computerGuess+"!");
	// write your code here
    }
}
