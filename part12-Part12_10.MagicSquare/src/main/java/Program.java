
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(5).sumsOfColumns());
        System.out.println(msFactory.createMagicSquare(5).sumsOfDiagonals());
    }
}
