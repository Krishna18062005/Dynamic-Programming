// Exercise 2: Simple Calculator
// This program performs addition, subtraction, multiplication, and division based on user input.

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero error!");
                    sc.close();
                    return;
                }
                break;
            default: 
                System.out.println("Invalid operation!");
                sc.close();
                return;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}