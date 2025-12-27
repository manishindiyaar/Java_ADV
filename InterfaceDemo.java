interface Shape {
    void draw();   // abstract method
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Shape s = new Circle();   // interface reference
        s.draw();
    }
}