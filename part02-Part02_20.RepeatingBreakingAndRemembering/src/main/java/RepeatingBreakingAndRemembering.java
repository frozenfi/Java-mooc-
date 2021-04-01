
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;
        int counter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        while (true) {
            System.out.println("Give numbers");
            input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {

                System.out.println("Thx! Bye!");
                break;
            }
            sum += input;
            counter++;

            if (input % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }

        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (double) sum / counter );
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);

    }
}
