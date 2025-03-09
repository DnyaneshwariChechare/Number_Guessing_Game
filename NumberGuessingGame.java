package com.jbk;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        // Set the range (1-100 or 1-1000)
	        int lowerBound = 1;
	        int upperBound = 100;
	        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

	        // Set the number of attempts
	        int maxAttempts = 5;
	        int attempts = 0;
	        boolean hasWon = false;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Guess the number between " + lowerBound + " and " + upperBound);
	        System.out.println("You have " + maxAttempts + " attempts to guess the right number.");

	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            int userGuess = scanner.nextInt();
	            attempts++;

	            if (userGuess == randomNumber) {
	                hasWon = true;
	                break;
	            } else if (userGuess < randomNumber) {
	                System.out.println("Too Low! Try again.");
	            } else {
	                System.out.println("Too High! Try again.");
	            }

	            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
	        }

	        if (hasWon) {
	            System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
	        } else {
	            System.out.println("Sorry, you've used all attempts. The correct number was: " + randomNumber);
	        }

	        scanner.close();
	    }
	}

