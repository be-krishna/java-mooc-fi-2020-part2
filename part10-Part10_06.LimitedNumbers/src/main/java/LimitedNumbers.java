
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                break;
            }

            numbers.add(number);
        }

        numbers.stream()
                .filter(s -> (s >= 1) && (s <= 5))
                .forEach(s -> System.out.println(s));
    }
}
