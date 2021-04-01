
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        int num1 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("");
        int num2 = Integer.parseInt(scanner.nextLine());
        
        double sum = (double )num1 + num2;
        
        System.out.println((double) Math.sqrt(sum));
    }
}
