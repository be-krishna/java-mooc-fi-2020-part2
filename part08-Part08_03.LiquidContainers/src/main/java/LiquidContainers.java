
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {

            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parameters = input.split(" ");

            String command = parameters[0];
            int amount = Integer.valueOf(parameters[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    if ((firstContainer + amount) > 100) {
                        firstContainer = 100;
                    } else {
                        firstContainer += amount;
                    }
                }
            }

            if (command.equals("remove")) {
                if (amount > secondContainer) {
                    secondContainer = 0;
                }
                if (amount > 0 && !((secondContainer - amount) < 0)) {
                    secondContainer -= amount;
                }
            }

            if (command.equals("move")) {
                if (amount > firstContainer && !(firstContainer == 0)) {
                    if ((secondContainer + firstContainer) > 100) {
                        secondContainer = 100;
                    } else {
                        secondContainer += firstContainer;
                    }
                    firstContainer = 0;
                }

                if (!(firstContainer == 0) && !((firstContainer - amount) < 0)) {
                    firstContainer -= amount;
                    if ((secondContainer + amount) > 100) {
                        secondContainer = 100;
                    } else {
                        secondContainer += amount;
                    }
                }
            }

        }
    }

}
