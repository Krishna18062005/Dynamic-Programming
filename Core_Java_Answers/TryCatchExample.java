// Exercise 20: Try-Catch Example
// This program handles division by zero gracefully using try-catch.

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend and divisor (separated by space): ");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        try {
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}