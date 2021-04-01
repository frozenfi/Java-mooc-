
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String userInput = scanner.nextLine();
            if(userInput.isEmpty()) {
                break;
            }
            
            items.add(new Item(userInput));
        } 
        for(Item itm: items) {
            System.out.println(itm);
        }

    }
}
