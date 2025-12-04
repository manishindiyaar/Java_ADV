

public class ErrorMaxofThree{
    public static void main(String[] args){


        int l = args.length;


        // we need to use try catch block for excepting only number no strings allowed if we get string print String not allowed


        try{
            int sum = 0;
            int max = Integer.MIN_VALUE;


            for(int i=0; i<l; i++){
                sum = sum + Integer.parseInt(args[i]);
                if(Integer.parseInt(args[i])> max){
                    max = Integer.parseInt(args[i]);
                }
            }

            System.out.println("Sum : "+sum);
            System.out.println("Maximum of those number : "+max);

        }catch(Exception e){

            System.out.println("String not allowed");
            
        }

    }
}