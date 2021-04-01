
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in her
    }
    public static void removeLast(ArrayList<String> strings) {
        if(!strings.isEmpty()) {
            strings.remove(strings.size()-1);
        }
    }

}
