
import java.util.Scanner;

public class AverageOfNumbers {

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
        
        System.out.println("Average of the numbers: " + (double) sum/(counter-1));

    }
}
