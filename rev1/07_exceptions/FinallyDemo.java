

public class FinallyDemo{
    public static void main(String[] args){
        try{
            int x = 10/2;
            System.out.println(x);
        } catch(Exception e){
            System.out.println("Error occurred");
        } finally{
            System.out.println("Finally block executed");
        }
    }
}