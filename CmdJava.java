


public class CmdJava{
    public static void main(String[] Args){
        int l = Args.length;

        int num;

        if(l<1){
            System.out.println("No arguments provided");
        }else{
            for(int i =0; i<l; i++){
                System.out.println(Args[i]);

                num = Integer.parseInt(Args[i]);

                if(num%2==0){
                    System.out.println("The number is even");
                }else{
                    System.out.println("The number is odd");
                }
                
            }
        }
    }
}