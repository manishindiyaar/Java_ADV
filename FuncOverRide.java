


public class FuncOverRide{
    void add(){
        System.out.println("Function from Parent Class");
    }

}

public class B extends FuncOverRide{
    void add(int a){
        System.out.println("Overloaded function with int parameter: " + a);
    }

    void add(){
        System.out.println("Function from Child Class");
    }


}