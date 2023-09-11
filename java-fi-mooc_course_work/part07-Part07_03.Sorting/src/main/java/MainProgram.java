
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int value = array[0];
        for (int num : array) {
            if (num < value) value = num; 
        }
        
        return value;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallestValue = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestValue) {
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int value = table[startIndex];
        int indexValue = startIndex;
        for(int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < value) {
                value = table[i];
                indexValue = i;
            }
        }
        
        return indexValue;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int index1Value = array[index1];
        array[index1] = array[index2];
        array[index2] = index1Value;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
