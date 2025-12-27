// Concept
// 	•	Passing values to methods
// 	•	Parameters

//     Problem
//     Add two numbers using a method.


public class MethodWithParams{
    static void add(int a, int b){
        System.out.println("Sum = " +(a+b));
    }

    public static void main(String[] args){
        add(10,20);
        add(6,7);
    }
}