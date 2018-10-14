package com.company;

import java.util.Scanner;

public class GuessingGameAI {
    public static void main(String[] args)
    {
        int min = 1;
        int max = 100;
        System.out.println("Wanna play a number guessing game? Neat!!! You pick a number from 1-"+max+".");
        int computerGuess = max / 2;
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();
        System.out.println(" Now, is your secret number " + computerGuess + "? That's right, isn't it??");
        while (computerGuess != userNumber)
        {
            String highLowCorrect = input.nextLine();
            if (highLowCorrect.equals("higher"))
            {
                System.out.println("No??? I need to go "+highLowCorrect+" then, huh? Easy! ");
                min = computerGuess;
                computerGuess = (min + max) / 2;
                System.out.println("Is your number "+computerGuess+"?");
            }
            if (highLowCorrect.equals("lower"))
            {
                System.out.println("No??? I need to go "+highLowCorrect+" then, huh? Easy!" );
                max = computerGuess;
                computerGuess = (min + max) / 2;
                System.out.println("Is your number "+computerGuess+"?");
            }
        }
        System.out.println("I feel like that was close. Is that actually correct?");
        String correct = input.nextLine();
        if (correct.equals("correct"))
        {
            System.out.println("Yes!!! I got it on my first try, too!");
        }
    }
}
