import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Books> book = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            
            System.out.println("Pages");
            int page = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int pub = Integer.parseInt(scanner.nextLine());
            
            book.add(new Books(name, page, pub));     
        }
             System.out.println("What information will be printed?");
            String userInput = scanner.nextLine();
            
            if(userInput.equals("everything")) {
               for(Books bookinfo: book) {
                   System.out.println(bookinfo);
               }
            } else if(userInput.equals("name")) {
                for(Books bookName : book) {
                    System.out.println(bookName.getName());
                }
            }

    }
}
