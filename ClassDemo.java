


import java.util.Scanner;

class Book {
    int yop;
    float rate;

    void disp1(){
        System.out.println("Rate : "+rate);
        System.out.println("Year of Publishing : " +yop);
    }
}

// Derived class (Not Public)

class JavaRef extends Book{
    String title;
    Scanner sc = new Scanner(System.in);

    void getData(){
        System.out.print("Enter Title : ");
        title = sc.nextLine();
        System.out.print("Enter Rate : ");
        rate = sc.nextFloat();

        System.out.print("Enter Year of Publishing : ");
        yop= sc.nextInt();

       

    }
    void disp2(){
            System.out.println("Title : "+title);

        }


}


public class ClassDemo{
    public static void main(String[] args){
        JavaRef jr = new JavaRef();


        jr.getData();
        jr.disp2();

    }
}

