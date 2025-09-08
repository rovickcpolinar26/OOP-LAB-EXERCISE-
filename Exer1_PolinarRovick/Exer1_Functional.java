import java.util.Arrays;
import java.util.List;

public class Exer1_Functional {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);

        int total = data.stream()
                        .filter(num -> num % 2 == 0)
                        .mapToInt(num -> num * num)
                        .sum();

        System.out.println("Result (Functional): " + total);
    }
}
