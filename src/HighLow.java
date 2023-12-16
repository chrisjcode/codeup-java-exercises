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
//case for selecting y and has guesses left
        if (confirm.equalsIgnoreCase("y") && guessesLeft > 0) {
            System.out.printf("\nGuess a number between %d and %d?\n", min, max);
            int guess = sc.nextInt();
//            out of range case
            if (guess > max || guess < min) {
                System.out.printf("%d is outside of the range of numbers to be guessed.\n", guess);
            }
            //     valid guess and will let user know higher, lower or correct.
            else if (guessResult(guess, randomNumber)) {
                ++guessCounter;
                System.out.printf("It took you %d times to find the correct answer.\n", guessCounter);
                resetGame();
                return;
            }else{
                //            set guesses values for next run of the recursion, and allow out of range guesses not to count against the guesses
                setGuessesLeft();
            }

            guessTheNumber(min, max, randomNumber);
        }
//        no guesses left
        else if (guessesLeft == 0) {
            System.out.println("You ran out of guesses.");
            resetGame();
        }
//        selected not y
        else {
            resetGame();
        }

    }

    static void resetGame() {
        System.out.println("Game Over!!!!!!!!!!!!!");
        guessCounter = 0;
        guessesLeft = guessLimit;
        sc.close();
    }

    static void setGuessesLeft() {
        ++guessCounter;
        guessesLeft = guessLimit - guessCounter;
        System.out.printf("You guessed %d times. You have %d guesses left.\n\n", guessCounter, guessesLeft);
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
