import java.util.Arrays;
import java.util.List;

public class Exer1_Declarative {
    public static void main(String[] args) {
        List<String> people = Arrays.asList("Anna", "Bob", "Charlie", "David");

        people.stream()
              .filter(person -> person.startsWith("A"))
              .forEach(person -> System.out.println("Starts with A: " + person));
    }
}
