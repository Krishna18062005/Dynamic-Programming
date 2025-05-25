// Exercise 24: ArrayList Example
// This program manages a list of names using an ArrayList.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names (type 'done' to finish):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            namesList.add(name);
        }
        System.out.println("Names entered: " + namesList);
        sc.close();
    }
}