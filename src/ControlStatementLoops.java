import java.util.
public class ControlStatementLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

// Don't do this!
        boolean confirmation = userInput == "y";

        String firstName = "Chris";
        String lastName = "Chris";

        System.out.println(firstName = lastName);
    }
}
