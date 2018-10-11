package com.company;

import java.util.Scanner;

public class GuessingGameAI {
    public static void main(String[] args) {
        System.out.print("Wanna play a number guessing game? Neat!!! You pick a number.");
        double computerGuess = Math.random() * 101;
        Scanner input = new Scanner(System.in);
        System.out.print("Shashasha! Now, is your secret number " + computerGuess + "? That's totally right, isn't it??");
        if (!(input.nextDouble() = computerGuess) && (input.nextDouble() > computerGuess)) {
            System.out.print("...Isn't it??? No??? I need to go lower then, huh? Easy! ");
            computerGuess = computerGuess - 10;
        } else if (input.nextDouble() < computerGuess) {
            System.out.print("...Isn't it??? No??? I need to go higher then, huh? Easy!");
            computerGuess = computerGuess + 10;
        } else {
            System.out.print("Shashasha! I knew I'd get it right. First try, too!");
        }
    }
}
