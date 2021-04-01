
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int num;
        do {
            System.out.println("Give a number: ");
            num = Integer.parseInt(scanner.nextLine());
            sum += num;
            counter++;

        } while (num != 0);
        
        System.out.println("Number of numbers: " +(counter-1));
        System.out.println("Sum of the numbers: " +sum);

    }
}
