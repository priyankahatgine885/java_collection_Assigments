package collection;
import java.util.ArrayList;

public class ArrayListUtil {
    private ArrayList<Integer> list;

    public ArrayList<Integer> saveEvenNumbers(int n) {
        list = new ArrayList<>();
        int i = 2;
        while (i <= n) {
            if (isEvenNumber(i)) {
                list.add(i);
            }
            i++;
        }
        return list;
    }

    private static boolean isEvenNumber(final int number) {
        return (number % 2) == 0;
    }

    public ArrayList<Integer> printEvenNumbers() {
        ArrayList newList = new ArrayList<>();
        System.out.print("Even number is : ");
        for (final int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("Multiply each number with 2 : ");
        for (final int item : list) {
            System.out.print(item * 2 + " ");
            newList.add(item * 2);
        }
        return newList;
    }
}
