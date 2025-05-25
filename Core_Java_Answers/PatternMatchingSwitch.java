// Exercise 30: Pattern Matching for Switch (Java 21)
// This program uses an enhanced switch statement with pattern matching.

public class PatternMatchingSwitch {
    public static void checkType(Object obj) {
        String result = switch(obj) {
            case Integer i -> "It's an Integer: " + i;
            case String s -> "It's a String: " + s;
            case Double d -> "It's a Double: " + d;
            default -> "Unknown type";
        };
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        checkType(100);
        checkType("Hello");
        checkType(3.14);
    }
}