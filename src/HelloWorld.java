import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        int id;
        boolean isLoggedIn;
        float bankAccountBalance;
        id = 123;
        isLoggedIn = false;
        bankAccountBalance = 1000.76F;


        int theAnswer = 42;
        String question = "What is your favorite color";

//        constants
        final int SIDES_OF_A_DICE = 6;


        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println(pi);
        System.out.println(almostPi);

//Exercise


//1.
        int myFavoriteNumber = 9;
        System.out.println(myFavoriteNumber);
//2.
        String myString = "Pizza is the best food";
        System.out.println(myString);

//     3.   cant explicitly cast to char from string
        myString = "a";

//       4. type must remain string cant cast to double
//        myString = 3.14;

//        5.
        long myNumber;
//error occurs because value wasnt initialized
//        System.out.println(myNumber);

//6. long data type cant implicitly convert to double
//        myNumber = 3.14;

//        7.
        myNumber = 123L;

//     8. This works because java can implicity convert to a smaller number data type because it takes up less space
        myNumber = 123;

//        9. start the myNumber variable as a float or double data type to begin with
//          myNumber = (float) 3.14;

        System.out.println(myNumber);

//        10
// ++ after variable increments after expression where as ++ before variable increments before the expression
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

         x = 5;
        System.out.println(++x);
        System.out.println(x);
//        11.
//       Not a statement
//int class= 5;
// 12. This cant be done

//        String theNumberThree = "three";
//        Object o = theNumberThree;
////        int three = (int) o;
//
//        int three = (int) "three";

//        13.

         x = 4;
//        x = x + 5;
        x =+ 5;
         x = 3;
        int y = 4;
//        y = y * x;
        y *= x;
         x = 10;
         y = 2;
//        x = x / y;
        x /= y;
//        y = y - x;
        y -= x;

//        14.


//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

//        You cant do this youll get an error
        String name = "Chris";
        String greetings = "Salutations";
//        System.out.printf("Hello %s", name);


        System.out.printf("Hello %s, %s", greetings, name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something");
//        String userInput = scanner.next();

//        System.out.println(userInput);
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        String userInputLine = scanner.nextLine();

        System.out.println(userInputLine);

        System.out.println("You entered: --> \"" + userInputLine + "\" <--");
    }

}