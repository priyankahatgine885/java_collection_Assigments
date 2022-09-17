package main;

import collection.LinkedListUtil;

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        LinkedListUtil linkedListUtil = new LinkedListUtil();
        linkedListUtil.saveEvenNumbers(n);
        linkedListUtil.printEvenNumbers();
    }
}
