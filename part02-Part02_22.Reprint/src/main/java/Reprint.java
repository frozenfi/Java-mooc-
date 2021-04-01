
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int num = Integer.parseInt(scanner.nextLine());

        int index = 0;
        while (index < num) {
            printText();
            index++;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
