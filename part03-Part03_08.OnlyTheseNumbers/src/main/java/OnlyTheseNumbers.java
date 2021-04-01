
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where? ");
        int indexStart = Integer.parseInt(scanner.nextLine());
        
        System.out.println("To where? ");
        int indexEnd = Integer.parseInt(scanner.nextLine());
        /*
        for(int i = indexStart; i <= indexEnd; i++) {
            System.out.println(numbers.get(i));
        }
        */
        
        int index = indexStart;
        while(index <= indexEnd) {
            
            System.out.println(numbers.get(index));
            index++;
        }
        
    }
}
