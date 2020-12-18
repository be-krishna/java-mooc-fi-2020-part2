
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int range = scanner.nextInt();
        
        Random rand = new Random();
        
        for (int i = 0; i < range; i++) {
            System.out.println(rand.nextInt(11));
        }
    }

}
