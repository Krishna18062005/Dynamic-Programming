// Exercise 27: Lambda Expressions
// This program sorts a list of strings using a lambda expression.

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "cherry");
        Collections.sort(fruits, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list: " + fruits);
    }
}