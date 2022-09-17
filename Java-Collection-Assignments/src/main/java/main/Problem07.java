package main;

import collection.VectorUtil;

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        VectorUtil vectorUtil = new VectorUtil();
        vectorUtil.saveEvenNumbers(n);
        vectorUtil.printEvenNumbers();
    }
}
