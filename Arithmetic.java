
import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] Args){
        int a, b, c;
        float d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        try{
        c = a+b;
        System.out.println("Sum = "+c);

        c = a-b;
        System.out.println("Diff =" +c);

        c=a*b;
        System.out.println("Product =" +c);

        c=(float)a/b;
        System.out.println("Quotient =" +c);

        c=a%b;
        System.out.println("Remainder =" +c);
            }
    catch(ArithmeticException e){
        System.out.println("Enter only numeric data");
        System.out.println("\n Error : " +e.toString());
    } catch(NumberMismatchException e){
        System.out.println("");
    }
    }
}