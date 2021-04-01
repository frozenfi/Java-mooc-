
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int counter = 0;
        int longestName = 0;
        String longName = "";
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] pieces = userInput.split(",");
            int birthYear = Integer.valueOf(pieces[1]);
            int lengthOfName = pieces[0].length();
            sum = sum + birthYear;
            counter++;
            if (longestName < lengthOfName) {
                longestName = lengthOfName;
                longName = pieces[0];

            }
        }

        System.out.println("Longest name" + longName);
        if (counter > 0) {
            System.out.println("Average of the birth years: " + (double) sum / counter);
        } else {
            System.out.println("error!!");
        }

    }
}
