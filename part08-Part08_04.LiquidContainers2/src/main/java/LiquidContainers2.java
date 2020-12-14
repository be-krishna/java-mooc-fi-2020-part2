
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();
        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] splits = input.split(" ");
            String command = splits[0];
            int amount = Integer.valueOf(splits[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }

            if (command.equals("move")) {
                firstContainer.move(amount, secondContainer);
            }

        }
    }

}
