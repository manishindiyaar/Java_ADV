

class Car{
    String model;
    int year;
    
    Car(String m, int y){
        model = m;
        year = y;
    }

    void display(){
        System.out.println(model + " " + year);
    }
}

public class ParameterizedConstructor{
    public static void main(String[] args){
        Car c1 = new Car("Tesla", 2025);
        Car c2 = new Car("BMW", 2022);

        c1.display();
        c2.display();
    }
}