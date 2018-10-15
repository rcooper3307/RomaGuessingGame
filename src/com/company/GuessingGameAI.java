package com.company;

import java.util.Scanner;

public class GuessingGameAI {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there, stranger! What's your name?");
        String userName = input.nextLine();
        int min = 1;
        int max = 100;
        int guessNumber = 0;
        System.out.println("Okay, "+userName+"! Wanna play a number guessing game? Neat!!! You pick a number from 1-"+max+".");
        int computerGuess = max / 2;
        int userNumber = input.nextInt();
        System.out.println(" Now, "+userName+", is your secret number " + computerGuess + "? That's right, isn't it??");
        while (computerGuess != userNumber)
        {
            String highLowCorrect = input.nextLine();
            guessNumber = guessNumber + 1;
            if (highLowCorrect.equals("higher"))
            {
                System.out.println("No??? I need to go "+highLowCorrect+" then, huh? Easy! ");
                min = computerGuess;
                computerGuess = (min + max) / 2;
                guessNumber = guessNumber + 1;

                System.out.println("Is your number "+computerGuess+", "+userName+"?");
            }
            if (highLowCorrect.equals("lower"))
            {
                System.out.println("No??? I need to go "+highLowCorrect+" then, huh? Easy!" );
                max = computerGuess;
                computerGuess = (min + max) / 2;
                guessNumber = guessNumber + 1;
                System.out.println("Is your number "+computerGuess+", "+userName+"?");
            }
        }
        System.out.println("I feel like that was close. Is that actually correct?");
        String correct = input.nextLine();
        if (correct.equals("correct"))
        {
            System.out.println("Yes!!! It only took me "+guessNumber+" tries, too!");
        }
    }
}
