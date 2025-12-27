

abstract class Vehicle{
    abstract void move();
}

public class AbstractClassDemo{
    public static void main(String[] args){
        // Vehicle v = new Vehicle(); //Not allowed
        System.out.println("Abstract class cannot be instantiated");
    }
}