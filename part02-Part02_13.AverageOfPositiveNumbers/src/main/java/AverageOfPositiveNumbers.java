
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveNum = 0;
        int counter = 0;
        
        while(true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0) {
                break;
            }
            
            if(num > 0) {
              
                positiveNum += num;
                counter = counter + 1;
            }    
        }
        
        if(positiveNum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = positiveNum/(double)counter;
            System.out.println("The average of given numbers is: " +avg);
        }
        
    }
}
