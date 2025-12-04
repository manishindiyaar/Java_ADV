public class MinMaxAvg{
    public static void main(String[] args){


        int l = args.length;
        

        // all args should be integer


        try{

            int sum = 0;
            int i, k , min, max ;

            float avg;

            

            min = Integer.parseInt(args[0]);
            max = Integer.parseInt(args[0]);

            for(i=0; i<l; i++){
                k = Integer.parseInt(args[i]);
                
                sum = sum + k;
                if(k> max){
                    max = k;
                }
                if(k< min){
                    min = k;
                }
            }

            avg = (float)sum / l;

            System.out.println("Sum : " + sum);

            System.out.println("Average : " + avg);
            System.out.println("Maximum : " + max);
            System.out.println("Minimum : " + min);

        }
        catch(Exception e){
            System.out.println("String not allowed");
        }

    }
}