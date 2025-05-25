// Exercise 18 (Part 2): Inheritance Example - Subclass: Dog
// This class extends Animal and overrides makeSound to print "Bark".

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
    
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        genericAnimal.makeSound();
        dog.makeSound();
    }
}