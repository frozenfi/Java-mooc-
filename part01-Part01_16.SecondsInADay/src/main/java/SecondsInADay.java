
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds? ");
        int day = Integer.valueOf(scanner.nextLine());
        
        int sec = day * 24 * 3600;
        
        System.out.println(sec);
        

    }
}
