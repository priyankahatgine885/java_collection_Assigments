package main;

import collection.ArrayListUtil;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        ArrayListUtil arrayListUtil = new ArrayListUtil();
        arrayListUtil.saveEvenNumbers(n);
        arrayListUtil.printEvenNumbers();
    }
}
