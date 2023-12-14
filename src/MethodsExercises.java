import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(1, 3));
        System.out.println(subtraction(1, 4));
        System.out.println(multiplication(4, 6));
        System.out.println(division(4, 2));
        System.out.println(modulus(39, 5));


//        getInteger(1, 10);

//        factorial(1, 10);

        shootingDice();
    }

    public static long addition(long num1, long num2) {
        return num1 + num2;
    }

    public static long subtraction(long num1, long num2) {
        return num1 - num2;
    }

    public static long multiplication(long num1, long num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("You cant divide by zero");
            return 0;
        }
        return num1 / num2;
    }

    public static long modulus(long num1, long num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter and integer between %d and %d", min, max);
        int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max) {
            sc.close();
            System.out.println("That's in range");
            return userInput;
        }
        return getInteger(min, max);
    }

    public static long factorial(int min, int max) {
        Scanner factorialScanner = new Scanner(System.in);
        System.out.println("Would you like to play factorial [y/n]?");
        String userInput = factorialScanner.next();
        if (userInput.equalsIgnoreCase("y")) {
            long numToFactor = getInteger(min, max);
            long counter = numToFactor;
            for (int i = 1; i < numToFactor; i++) {
                counter *= i;
            }
            factorialScanner.close();
            return counter;
        } else if (userInput.equalsIgnoreCase("n")) {
            factorialScanner.close();
            return -1;
        }

        return factorial(min, max);
    }

    public static void shootingDice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wanna roll some dice [y/n]?");
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("y")) {
            System.out.println("Ok! How many sides are on this dice?");
            int sidesInput = sc.nextInt();
            double roll1 = Math.random() * (sidesInput - 1) + 1;
            double roll2 = Math.random() * (sidesInput - 1) + 1;
            System.out.printf("Roll 1 is %f.0F, and Roll 2 is %f.0F", roll1, roll2);
            return;
        } else if (userInput.equalsIgnoreCase("n")) {
            return;
        }
        shootingDice();
    }
}
