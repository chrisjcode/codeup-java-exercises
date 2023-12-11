import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f \n", pi);
//        System.out.format("The value of pi is approximately " + pi);

//Exception in thread if you enter a string
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number please");
//        int numberInput = scanner.nextInt();
//
//        System.out.println(numberInput);
//
//        System.out.println("Enter three words");
//        String input1 = scanner.next();
//        String input2 = scanner.next();
//        String input3 = scanner.next();
//        System.out.printf("The words you entered are: $s %n %s %n %s %n",input1, input2, input3);
//
//
//        System.out.println("Enter a sentence");
//        String sentence = scanner.nextLine();
//        System.out.printf("Here is your sentence: %n %s%n",sentence);

//Get perimeter
        System.out.println("Enter the length");
        String userInputlength = scanner.nextLine();
        int length = Integer.parseInt(userInputlength);
        System.out.println(length);

        System.out.println("Enter the width");
        String userInputWidth = scanner.nextLine();
        int width = Integer.parseInt(userInputWidth);
        System.out.println(width);
        int perimeter =  (2*width) + (2*length);
     int area =  width * length;

     System.out.println("The perimeter is " + perimeter);

        System.out.println("The area is " + area);


//        Get Area
    }
}
