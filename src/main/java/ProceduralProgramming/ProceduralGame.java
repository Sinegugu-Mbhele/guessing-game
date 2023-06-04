package ProceduralProgramming;

import java.util.Random;
import java.util.Scanner;

public class ProceduralGame {
    public static void main(String[] args){

        Random random = new Random();

        Scanner scanner = new Scanner(System.in); // user input

        int randNum = random.nextInt(10) +1;
        System.out.println( "Random number is: " + randNum);// Debugging purposes
        System.out.println("Enter your guess (1-10):");

        int playerGuess = scanner.nextInt();

        if (playerGuess == randNum) {
            System.out.println("correct! You win!");
        }
        else if(randNum > playerGuess) {
            System.out.println("Nope! The number is higher. Guess again");
        }
        else {
            System.out.println("Nope! The number is lower. Guess again");
        }
    }

}
