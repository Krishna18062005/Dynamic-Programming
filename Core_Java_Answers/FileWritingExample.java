// Exercise 22: File Writing
// This program writes user input to a text file called output.txt.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String input = sc.nextLine();
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(input);
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}