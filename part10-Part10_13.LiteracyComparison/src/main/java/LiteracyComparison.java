
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<LiteracyData> data = getData("literacy.csv");
        
        data.stream().sorted().forEach(entry -> System.out.println(entry));

    }
    
    public static List<LiteracyData> getData(String file){
        List<LiteracyData> data = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .map(splits -> new LiteracyData(
                            splits[0].trim(),
                            splits[1].trim(), 
                            splits[2].trim(),
                            splits[3].trim(), 
                            Integer.valueOf(splits[4].trim()), 
                            Double.valueOf(splits[5].trim())))
                    .forEach(value -> data.add(value));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return data;
    }
}
