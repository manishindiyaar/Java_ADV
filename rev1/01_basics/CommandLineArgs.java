

public class CommandLineArgs{
    public static void main(String[] args){

        int arg_len = args.length;
        if(arg_len == 0){
            System.out.println("No argument provided");
            return;
        } 

        //print all the arguments with index values
        for (int i = 0; i< arg_len; i++){
            System.out.println("Arg " + i + " : " + args[i]);
        }


    }
}