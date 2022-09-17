package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem03 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mahesh");
        stringList.add("Pooja");
        stringList.add("Nitin");
        printAll(stringList);
    }

    private static void printAll(List<String> stringList) {
        Iterator<String> iterator = stringList.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }
}
