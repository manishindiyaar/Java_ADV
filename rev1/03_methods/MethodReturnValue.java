
// Returning value from method

public class MethodReturnValue{

    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        int sum = add(3,10);
        System.out.println("Result = " + sum);
    }

}