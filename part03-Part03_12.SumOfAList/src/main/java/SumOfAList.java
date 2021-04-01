
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        
        /*
        //Method I
        for(int i = 0; i< list.size(); i++) {
            sum += list.get(i);
        }
       */
        
        // Method II
        int index = 0;
        while(index < list.size()) {
            sum += list.get(index);
            index++;
        }
        /*
        
        //Method III
        for(Integer num: list) {
            sum += num;
        }
        */
         System.out.println("sum: " +sum );
              
    }
}
