
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            
            inputs.add(input);
        }
        
        double nAverage = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s < 0)
                .average()
                .getAsDouble();
        
        double pAverage = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s > 0)
                .average()
                .getAsDouble();
        
        System.out.println("Print the average of the negative numbers or "
                + "positive numbers? (n/p)");
        
        String response = scanner.nextLine();
        
        if(response.equals("n")){
            System.out.println(nAverage);
        }else{
            System.out.println(pAverage);
        }
    }
}
