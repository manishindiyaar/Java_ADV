
import java.util.Scanner;

public class ArmStrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, m, r, sum=0;

        System.out.print("Enter a number: ");
        
        try {
            n = sc.nextInt();
            m=n;    

            while(n>0){
                r = n%10;
                n = n/10;
                sum=sum+r*r*r;

                if(sum== m){
                    System.out.println(m + "is an Armstrong Number .");

                }else{
                    System.out.println(m+ "is not an Armstrong number.");
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid input!");
            return;
        }





    }
}