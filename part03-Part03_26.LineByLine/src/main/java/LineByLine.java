
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String read = scanner.nextLine();
            if(read.equals("")) {
                break;
            }
            
            String[] pieces = read.split(" ");
            for(String splitted: pieces) {
                System.out.println(splitted);
            }
        }


    }
}
