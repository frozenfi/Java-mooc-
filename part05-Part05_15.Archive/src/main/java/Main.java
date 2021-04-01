
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Archive> archive= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            id = scanner.nextLine();
            if(id.isEmpty()) {
                break;
            } 
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();

            
            Archive arc = new Archive(id,name);
            if(!archive.contains(arc)){
                archive.add(arc);
            } 
            
     
        }
        
        System.out.println("==Items==");
        
        for(Archive info: archive) {
            System.out.println(info);
        }
    }
}
