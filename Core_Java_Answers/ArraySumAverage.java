// Exercise 14: Array Sum and Average
// This program calculates the sum and average of elements in an array entered by the user.

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] elements = new int[n];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt();
            sum += elements[i];
        }
        double average = (n > 0) ? (double) sum / n : 0;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        sc.close();
    }
}