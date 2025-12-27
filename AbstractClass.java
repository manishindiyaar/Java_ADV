// Simple example of Abstract Class and Abstract Method

abstract class Animal {

    // abstract method (no body)
    abstract void sound();

    // normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    // implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Animal a = new Dog();   // upcasting
        a.sound();              // calls Dog's method
        a.sleep();              // calls Animal's method
    }
}