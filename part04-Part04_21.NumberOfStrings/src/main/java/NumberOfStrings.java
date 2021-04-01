
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
       ArrayList<String> user = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String userInput = scanner.nextLine();
        
            if(userInput.equalsIgnoreCase("end")) {
                break;
            }
            user.add(userInput);
        }
        System.out.println(user.size());
     }
}
