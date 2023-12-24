
public class MagicSquareFactory {
    
    private int[] startingPoint = new int[2];
    private int startingValue;

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        startingPoint[0] = size / 2;
        startingPoint[1] = 0;
        startingValue = 1;
        square.placeValue(startingPoint[0], startingPoint[1], startingValue);
        
        while (!square.isMagicSquare()) {
            updatePositionAndValue();
            adjustPositions(size);
            
            if (square.readValue(startingPoint[0], startingPoint[1]) != 0) {
                adjustPositionIfValueExists(size);
            }
            square.placeValue(startingPoint[0], startingPoint[1], startingValue);
        }
        
        return square;
    }
    
    private void updatePositionAndValue() {
        startingPoint[0] += 1;
        startingPoint[1] -= 1;
        startingValue += 1;
    }
    
    private void adjustPositions(int size) {
        if (startingPoint[0] > size - 1) {
            startingPoint[0] = 0;
        }
        if (startingPoint[1] < 0) {
            startingPoint[1] = size - 1;
        }
    }
    
    private void adjustPositionIfValueExists(int size) {
        startingPoint[0] -= 1;
        startingPoint[1] += 2;
        if (startingPoint[0] < 0) {
            startingPoint[0] = size - 1;
        }
        if (startingPoint[1] == size) {
            startingPoint[1] = 0;
        } else if (startingPoint[1] == size + 1) {
            startingPoint[1] = 1;
        }
    }

}
