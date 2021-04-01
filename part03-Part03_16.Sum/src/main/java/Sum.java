
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        int index = 0;
        while(index < numbers.size()) {
            sum += numbers.get(index);
            index++;
        }
        return sum;
        
        //Alternative method
        /*
        for(Integer number: numbers) {
            sum +=number;   
        }
        return sum;
        */
    }
}
