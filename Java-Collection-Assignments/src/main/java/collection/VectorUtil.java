package collection;
import java.util.Vector;

public class VectorUtil {
    private Vector<Integer> vector;

    public Vector<Integer> saveEvenNumbers(int n) {
        vector = new Vector<>();
        int i = 2;
        while (i <= n) {
            if (isEvenNumber(i)) {
                vector.add(i);
            }
            i++;
        }
        return vector;
    }

    private static boolean isEvenNumber(final int number) {
        return (number % 2) == 0;
    }

    public Vector<Integer> printEvenNumbers() {
        Vector<Integer> newVector = new Vector<>();
        System.out.print("Even number is : ");
        for (final int item : vector) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("Multiply each number with 2 : ");
        for (final int item : vector) {
            System.out.print(item * 2 + " ");
            newVector.add(item * 2);
        }
        return newVector;
    }
}
