// Exercise 13: Recursive Fibonacci
// This program calculates the nth Fibonacci number using recursion.

import java.util.Scanner;

public class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        System.out.println("The " + n + "th Fibonacci number is " + fibonacci(n));
        sc.close();
    }
}