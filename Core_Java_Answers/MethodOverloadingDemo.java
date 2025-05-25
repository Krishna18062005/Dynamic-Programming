// Exercise 12: Method Overloading
// This program demonstrates method overloading with multiple 'add' methods.

public class MethodOverloadingDemo {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println("add(2, 3): " + add(2, 3));
        System.out.println("add(2.5, 3.5): " + add(2.5, 3.5));
        System.out.println("add(1, 2, 3): " + add(1, 2, 3));
    }
}