public class ControlFlowExercises {
    public static void main(String[] args) {
//         Loop Basics
//        While
        /* */
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            if (i == 15) {
                System.out.println("While loop is done.");
            }
            i++;
        }

//        Convert Above to For Loop
        for (int iRedo = 5; iRedo <= 15; iRedo++) {
            System.out.println(iRedo);
            if (iRedo == 15) {
                System.out.println("For loop is done.");

            }
        }


//do while
        int j = 0;
        do {
            System.out.println(j);
            if (j == 100) {
                System.out.println("Do While loop is done.");
            }
            j += 2;
        } while (j <= 100);

        for (int jRedo = 0; jRedo <= 100; jRedo += 2) {
            System.out.println(jRedo);
            if (jRedo == 100) {
                System.out.println("For loop is done.");

            }
        }

        //do while again
        int k = 100;
        do {
            System.out.println(k);
            if (k == 0) {
                System.out.println("Do While Decrementing is done.");
            }
            k -= 5;
        } while (k >= 0);

        for (int kRedo = 100; kRedo >= 0; kRedo -= 5) {
            System.out.println(kRedo);
            if (kRedo == 0) {
                System.out.println("For loop is done.");
            }
        }

        //do while
        long l = 2;
        do {
            System.out.println(l);
            if (l >= 1000000) {
                System.out.println("Do While Exponents is done.");
            }
            l *= 2;
        } while (l <= 1000000);

        for (int lRedo = 2; lRedo <= 1000000; lRedo *= 2) {
            System.out.println(lRedo);
            if (lRedo < 1000000) {
                System.out.println("Do While Exponents is done.");
            }
        }


        for (int m = 0; m <= 100; m++) {
            if (m % 3 == 0 && m % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (m % 5 == 0) {
                System.out.println("Fizz");
            } else if (m % 3 == 0) {
                System.out.println("Buzz");
            }

        }

    }
}
