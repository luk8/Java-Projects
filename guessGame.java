// A stand-alone Non-GUI Java Program to guessing game where user is prompt to enter a number and computer randomly selects a number.
// The user is given four tries to guess the number.
// If the user is unable to guess the number after four tries, the user loses and is asked if they would like to play again.
// If the user guesses the correct number, the user is notified as being correct and is asked if they would like to play again.

// Packages to be called

import java.util.Random;
import javax.swing.JOptionPane;

public class guessGame {

    public static void main(String[] args) {

        boolean playAgain = false; // declare playAgain is false
        boolean winner = false; // declare winner false

        // Run program to play guessing game

        while (playAgain == false) {

            if (playGame(winner) == true)
                JOptionPane.showConfirmDialog(null, "You are correct! Would you like to play again?", "Choose one.", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            else
                JOptionPane.showConfirmDialog(null, "You lost! Would you like to play again?", "Choose one", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        }

    }

    // Prompt user for number to guess, computer generates random number and decrement number of tries

    public static boolean playGame(boolean winner) {

        int userInput = 0; // declare userInput as 0
        int numGuess = 0; // declare numGuess as 0
        int numberTries = 5; // declare numberTries as 5

        Random rand = new Random();
        int compValue;
        compValue = rand.nextInt(9) + 1; // computer generates random number

        // while loop determines if the number the user guess is correct, too low or too high

        while(numGuess <= numberTries) {

            numberTries--;

            userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between 1 to 10", " " + numberTries + " number of guess left", JOptionPane.QUESTION_MESSAGE)); // covert string to int

            if (compareTo(userInput, compValue) == 0) {
                return true;
            }

            else if (compareTo(userInput, compValue) > 0) {
                JOptionPane.showMessageDialog(null, "Your guess was too high!", " " + numberTries + " number of guess left", JOptionPane.QUESTION_MESSAGE);
            }

            else if (compareTo(userInput, compValue) < 0){
                JOptionPane.showMessageDialog(null, "Your guess was too low!", " " + numberTries + " number of guess left", JOptionPane.QUESTION_MESSAGE);
            }

        }

        return false;
    }

    // Compare the user input to random number between 1 to 10 by computer

    public static int compareTo(int userInput, int compValue){

        if (userInput == compValue) {
            return 0;
        }

        else if (userInput > compValue) {
            return 1;
        }

        else {
            return -1;
        }
    }
}
