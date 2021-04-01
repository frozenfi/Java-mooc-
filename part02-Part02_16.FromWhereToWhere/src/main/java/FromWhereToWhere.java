
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i; 
        
        System.out.print("Where to? ");
        int endNum = Integer.valueOf(scanner.nextLine());
        
        System.out.print("from where? ");
        int startNum = Integer.valueOf(scanner.nextLine());
        
        for (i = startNum; i<=endNum; i++) {
            System.out.println(i);
        }
    }
}
