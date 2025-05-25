// Exercise 25: HashMap Example
// This program maps student IDs to student names using a HashMap.

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }
        System.out.print("Enter an ID to lookup: ");
        int lookupId = sc.nextInt();
        System.out.println("Student name: " + studentMap.get(lookupId));
        sc.close();
    }
}