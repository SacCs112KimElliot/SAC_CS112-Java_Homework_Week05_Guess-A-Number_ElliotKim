/* 
 * Subject:     SAC_CS112-Java_Homework_Week05_Guess-A-Number_ElliotKim
 * Objective:   Allow user to play until they no longer wish to play
                Hint:  Ask after each round
                Keep track of number of good guesses
                Keep track of number of bad guesses
                Keep track of number of games played
                Calculate guess percentage for each game 
                Calculate overall guess percentage
 * DueDate:     Mon, 09/27/2016
 * Programmer:  Elliot Kim
 */

package sac_cs112.java_homework_week05_elliotkim;
import java.util.Scanner;

public class SAC_CS112Java_Homework_Week05_ElliotKim 
{
    
     public static void main(String[] args) 
    {
        // variable to contain user's intension to stop playing the game
        String StopPlayingUpperCase = "Y";
        
        // Introduce the game to user
            System.out.println("Hello world!\n"
                    + "Let's play Guess-A-Number game.\n"
                    + "I have a number randomly generated.\n");
            
        // counter to count good guesses
        // counter to count bad guess
        // counter to count total number of game played
        int GoodGuess = 0;
        int BadGuess = 0;
        int TotalNumberGame = 0;
        
        // while loop to keep playing the game until the user type "N"
        while (!StopPlayingUpperCase.equals("N"))
        {
            // Generate a random number
            int RandomNumber;
            RandomNumber = 1 + (int) ( Math.random() * 10 );
                    

            // Introduce the game to user
            System.out.println("Why don't you guess a number between 1 to 10?:");
            Scanner input = new Scanner(System.in);
            int UserGuess = input.nextInt();
            
            // Let the user know of the result
            if (RandomNumber == UserGuess)
            {
                System.out.println("Wow! You guessed it right.");
                GoodGuess++;
            }
            else
            {
                System.out.println("Sorry. That was not it.");
                BadGuess++;
            }
            
            // count total number of game played
            TotalNumberGame++;
            
            // Ask the user whether still wants to play
            System.out.println("\nDo you want to play it again?\nPress any key to play or type N to quit:");
            String StopPlaying = input.next();
            StopPlayingUpperCase = StopPlaying.toUpperCase();
            
            // Check a status
            System.out.println("\nGame report\nLast random number was: " +  RandomNumber + 
                    ".\nUser's last number guessed was: " + UserGuess +
                    ".\nUser's intention on quitting game was: " + StopPlayingUpperCase + 
                    ".\nNumber of total games played was: " + TotalNumberGame +
                    ".\nNumber of good guess was: " + GoodGuess +
                    ".\nNumber of bad guess was: " + BadGuess +
                    // Percentage of guess for all games played
                    ".\nPercentage of good guess for all games played so far is: %" + (float)GoodGuess/TotalNumberGame*100 + ".\n");
         } 
        System.out.println("Good bye!\n");
    }
}
