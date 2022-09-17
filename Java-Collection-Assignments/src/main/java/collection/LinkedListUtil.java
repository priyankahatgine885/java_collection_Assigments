package collection;

import java.util.LinkedList;

public class LinkedListUtil {
    private LinkedList<Integer> list;

    public LinkedList<Integer> saveEvenNumbers(int n) {
        list = new LinkedList<>();
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

    public LinkedList<Integer> printEvenNumbers() {
       LinkedList<Integer> newList = new LinkedList<>();
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
