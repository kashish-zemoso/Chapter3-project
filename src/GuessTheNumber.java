import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int computedGuess;
        computedGuess = random.nextInt(100)+1;
        int myGuess,guessCount=1;
        boolean guess = false;

        while(guess == false){
            System.out.println("Enter you integer guess");
            myGuess = input.nextInt();
            guessCount++;

            if(myGuess >= 1 && myGuess <= 100){
                if(myGuess == computedGuess){
                    System.out.println("Congratulations! You guessed the number in " + guessCount + " guesses! Thanks for playing!");
                    guess = true;
                }
                else if(myGuess > computedGuess){
                    System.out.println("Your guess is too high!");
                }
                else{
                    System.out.println("Your guess is too low!");
                }
            }
            else{
                System.out.println("That was a wasted guess! You must pick a number between 1 and 100(inclusive)");
            }
        }
    }
}
