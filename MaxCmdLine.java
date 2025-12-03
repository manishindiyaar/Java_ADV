//Max of three numbers using CLA


public class MaxCmdLine{
    public static void main(String[] Args){

        int l = Args.length;

        int sum = 0;
        int max = Integer.MIN_VALUE;

        if(l<1){
            System.out.println("No Argument Provided");
        }else{
            for(int i = 0; i<l; i++){
                System.out.println(Args[i]);

                sum = sum + Integer.parseInt(Args[i]);

                if(Integer.parseInt(Args[i]) > max){
                    max = Integer.parseInt(Args[i]);
                }
            }
        }

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Maximum number: " + max);           
    }
}