import java.util.*;

public class Main {
    public static void main(String[] args) {

//        ReadingList jonisList = new ReadingList();
//        jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
//        jonisList.add(new TextMessage("arto", "have you checked the submissions yet?"));
//
//        System.out.println("Joni's to-read: " + jonisList.toRead());
//
//        List<Integer> test = List.of(1, 2, 3);
//        List<Integer> newTest = test.stream().filter(num -> num % 2 == 0).toList();



//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            numbers.add(i);
//        }
//
//        long howManyNumbers = numbers.stream()
//                .filter(i -> i < 4)
//                .map(i -> i * 2)
//                .filter(i -> i > 10)
//                .count();
//
//        System.out.println("Numbers: " + howManyNumbers);



//        List<Film> films = new ArrayList<>();
//        films.add(new Film("A", 2000));
//        films.add(new Film("B", 1999));
//        films.add(new Film("C", 2001));
//        films.add(new Film("D", 2000));
//
//        for (Film e: films) {
//            System.out.println(e);
//        }
//
//        Comparator<Film> comparator = Comparator
//                .comparing(Film::getReleaseYear)
//                .thenComparing(Film::getName);
//
//        Collections.sort(films, comparator);
//
//        for (Film e: films) {
//            System.out.println(e);
//        }


//        int a[] = { 1, 8, 3 };
//
//        int b[] = Arrays.copyOf(a, 5);
//
//        Arrays.stream(b).forEach(v -> System.out.println(v));


        int[][] matrix = {
                {47, 58, 69, 80, 1, 12, 23, 34, 45},
                {57, 68, 79, 9, 11, 22, 33, 44, 46},
                {67, 78, 8, 10, 21, 32, 43, 54, 56},
                {77, 7, 18, 20, 31, 42, 53, 55, 66},
                {6, 17, 19, 30, 41, 52, 63, 65, 76},
                {16, 27, 29, 40, 51, 62, 64, 75, 5},
                {26, 28, 39, 50, 61, 72, 74, 4, 15},
                {36, 38, 49, 60, 71, 73, 3, 14, 25},
                {37, 48, 59, 70, 81, 2, 13, 24, 35}
        };

        ArrayList<Integer> sumOfDiag = new ArrayList<>();

        int firstDiagSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            firstDiagSum += matrix[i][i];
        }

        int secondDiagSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            secondDiagSum += matrix[i][matrix.length - i - 1];
        }

        sumOfDiag.add(firstDiagSum);
        sumOfDiag.add(secondDiagSum);

        System.out.println(sumOfDiag);


        ArrayList<Integer> sumOfRows = new ArrayList<>();

        for (int[] row : matrix){
            int sum = 0;
            for (int value: row) {
                sum += value;
            }
            sumOfRows.add(sum);
        }

        System.out.println(sumOfRows);

        ArrayList<Integer> sumOfColumns = new ArrayList<>();

        for (int c = 0; c < matrix.length; c++) {
            int sum = 0;
            for (int r = 0; r < matrix.length; r++) {
                sum += matrix[r][c];
            }
            sumOfColumns.add(sum);
        }

        System.out.println(sumOfColumns);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                numbers.add(matrix[row][col]);
            }
        }

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                System.out.println("BOOM");
            }
        }
    }
}