// Exercise 37: Using javap to Inspect Bytecode
// This class is used for inspecting its bytecode with the 'javap -c' command.

public class UsingJavapExample {
    public void sayHello() {
        System.out.println("Hello, Javap!");
    }
    
    public static void main(String[] args) {
        new UsingJavapExample().sayHello();
    }
}