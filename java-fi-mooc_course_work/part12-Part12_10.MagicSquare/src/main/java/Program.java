
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare magicSquare = msFactory.createMagicSquare(9);
        
        System.out.println(magicSquare.isMagicSquare());
        System.out.println(magicSquare.sumsOfRows());
        System.out.println(magicSquare.sumsOfColumns());
        System.out.println(magicSquare.sumsOfDiagonals());
        System.out.println(magicSquare.allNumbersDifferent());
        System.out.println(magicSquare);
    }
}
