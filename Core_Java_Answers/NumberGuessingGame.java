// Exercise 10: Number Guessing Game
// This interactive game asks the user to guess a randomly generated number between 1 and 100.

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        System.out.println("Guess the number between 1 and 100.");
        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess < target) {
                System.out.println("Too low!");
            } else if (guess > target) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed correctly.");
            }
        }
        sc.close();
    }
}