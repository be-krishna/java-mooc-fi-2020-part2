
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
       HasMap<Integer, String> map = new HasMap<>();
       
       map.add(1, "one");
       map.add(2, "two");
       
        System.out.println(map.get(1));
    }

}
