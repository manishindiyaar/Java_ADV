

public class CalculatorMethods{
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }


    public static void main(String[] args){
        System.out.println("Addition = " + add(10,3));
        System.out.println("Subtraction = " + sub(10,3));
        System.out.println("Multiplication = " + mul(10,3));
        System.out.println("Division = " + div(10,3));
    }
}