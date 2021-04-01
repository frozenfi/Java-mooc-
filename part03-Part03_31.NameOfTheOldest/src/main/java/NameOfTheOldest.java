
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";

        while (true) {

            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }

            String[] pieces = userInput.split(",");

            if(Integer.parseInt(pieces[1]) > oldest) {
                oldest = Integer.parseInt(pieces[1]);
                name = pieces[0];
            }

        }
        System.out.println("Name of the oldest: " + name);

    }
}
