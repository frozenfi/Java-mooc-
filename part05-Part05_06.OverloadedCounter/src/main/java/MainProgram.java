
public class MainProgram {

    public static void main(String[] args) {
       Counter c = new Counter(9);
       
      
       c.increase(3);
       c.increase(3);
       System.out.println(c.value());
        
       c.decrease();
       System.out.println(c.value());
    }
}
