// Exercise 34: Create and Use Java Modules (com.greetings)
// This class is part of the com.greetings module and uses the Utils class from com.utils.

package com.greetings;
import com.utils.Utils;

public class Greetings {
    public static void main(String[] args) {
        Utils.greet("World");
    }
}