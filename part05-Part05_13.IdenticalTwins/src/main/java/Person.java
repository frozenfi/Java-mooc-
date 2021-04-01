
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
      
        Person info = (Person) compared;
        if (this.name.equals(info.name)
                && this.birthday.equals(info.birthday)
                && this.weight == info.weight
                && this.height == info.height) {
            return true;
        }
        return false;
    }
}
