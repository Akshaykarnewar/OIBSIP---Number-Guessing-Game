//NUMBER GUESSING GAME in Java

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        //Generate a random number
        Random random = new Random();
        int number = random.nextInt(100);

        //Declare the Scanner
        Scanner s= new Scanner(System.in);
        int guess;
        int attempts = 0;

        //Game instructions
        System.out.println("Welcome to the number guessing game!");
        System.out.println("The game is simple. I have picked a number between 1 and 100. Try to guess it in as few guesses as possible!");
        System.out.println("Let's begin!");

        //Start the game
        do 
        {
            System.out.print("Enter your guess: ");
            guess = s.nextInt();
            attempts++;
            if(guess > number) 
            {
                System.out.println("Your guess is too high. Try again.");
            } 
            else if (guess < number) 
            {
                System.out.println("Your guess is too low. Try again.");
            }
        } 
        while (guess != number);
        s.close();

        //When the game ends
        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts!");
    }
}