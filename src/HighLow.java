import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        int randomNumber = getRandomNumber(1, 100);
        guessTheNumber(1, 100, randomNumber);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    //using recursion so defined these variables outside of the method
    static int guessCounter = 0;
    static int guessLimit = 7;
    static int guessesLeft = guessLimit;
    static Scanner sc = new Scanner(System.in);
    static String confirm = "";

    public static void guessTheNumber(int min, int max, int randomNumber) {
        if (guessCounter == 0) {
            System.out.println("Do you want to play the guessing game? [y/n]?");
            confirm = sc.next();
        }

        if (confirm.equalsIgnoreCase("y") && guessesLeft > 0 && guessCounter <= guessLimit) {
            System.out.printf("Guess a number between %d and %d?\n", min, max);
            int guess = sc.nextInt();
            if (guess > max || guess < min) {
                System.out.printf("%d is outside of the range of numbers to be guessed.", guess);
            } else if (guessResult(guess, randomNumber)) {
                System.out.printf("You guessed %d times. You have %d guesses left.\n\n", guessCounter, guessesLeft);
                guessCounter = 0;
                sc.close();
                return;
            }
            ++guessCounter;
            guessesLeft = guessLimit - guessCounter;
            System.out.printf("You guessed %d times. You have %d guesses left.\n\n", guessCounter, guessesLeft);
            guessTheNumber(min, max, randomNumber);
        } else if (guessesLeft == 0) {
            System.out.println("You ran out of guesses.");
        }
        guessCounter = 0;
        sc.close();
        guessesLeft = 0;
    }

    public static boolean guessResult(int guess, int randomNumber) {

        if (randomNumber == guess) {
            System.out.println("\nGOOD GUESS!");
            return true;
        } else if (randomNumber < guess) {
            System.out.println("\nLOWER");
            return false;
        } else {
            System.out.println("\nHigher");
            return false;
        }
    }


}
