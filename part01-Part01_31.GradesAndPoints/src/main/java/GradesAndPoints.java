
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]");
        int point = Integer.valueOf(scan.nextLine());
        
        if(point > 100) {
            System.out.println("incredible!");
        } else if(point >= 90) {
            System.out.println("Grade: 5");
        } else if(point >= 80) {
            System.out.println("Grade: 4");
        } else if (point >= 70) {
            System.out.println("Grade: 3");
        } else if(point >= 60) {
            System.out.println("Grade: 2");
        } else if(point >= 50) {
            System.out.println("Grade: 1");
        } else if(point >= 0 ) {
            System.out.println("Grade: failed");
        } else {
            System.out.println("impossible!");
        }
    }
}