
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int num;
        do {
            System.out.println("Give a number: ");
            num = Integer.parseInt(scanner.nextLine());
            counter++;

        } while (num != 0);
        
        System.out.println("Number of numbers: " + (counter - 1));

    }
}
