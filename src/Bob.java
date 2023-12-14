import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        startConversation();
    }

    public static Scanner sc = new Scanner(System.in);

    public static void startConversation() {
        System.out.println(questionSelections());

        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Sure.");

                break;
            case 2:
                System.out.println("Whoa, chill out!");

                break;
            case 3:
                System.out.println("Fine. Be that way!");

                break;
            case 4:
                System.out.println("Whatever.");

                break;
            case 5:
                System.out.println("Bob is pissed but see you later.");
                sc.close();
                return;
            default:
                startConversation();
                break;
        }
        startConversation();
    }

    public static String questionSelections() {
        return """
                1. Ask Bob a question?
                2. Yell at Bob!
                3. Say Nothing...
                4. Say what you want.
                5.-> Leave the Chat <-
                """;
    }
}
