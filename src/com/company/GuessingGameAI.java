package com.company;

import java.util.Scanner;

public class GuessingGameAI {
    public static void main(String[] args) {
        System.out.print("Wanna play a number guessing game? Neat!!! You pick a number from 1-100.");
        int min = 1;
        int max = 100;
        int computerGuess = max/2;
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();
        System.out.print(" Now, is your secret number "+computerGuess+"? That's totally right, isn't it??");
        if (computerGuess != userNumber)
        {
            if (input.equals("higher")){
            {
                System.out.print("No??? I need to go higher then, huh? Easy! ");
                min = computerGuess;
                computerGuess = (min + max) / 2;
            }
            if (input.equals("higher")){

            }
        }
}
