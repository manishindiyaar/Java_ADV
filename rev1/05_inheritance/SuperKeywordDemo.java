


import java.util.Scanner;
class Vehicle{
    int speed = 60;

    void showSpeed(){
        System.out.println("Vehicle speed : " + speed);
    }
}

class Car extends Vehicle{
    int speed = 120;

    void display(){
        System.out.println("Car Speed : " + speed);
        System.out.println("Parent speed : " + super.speed);
        super.showSpeed();
    }

}

public class SuperKeywordDemo{
    public static void main(String[] args){
        Car c = new Car();
        c.display();
    }
}
