
public class RevArr{
    public static void main(String[] args){
        String str;
        int i,j,l;
        l = args.length;
        if(l>0){
            i = 0;
            j = l-1;
            while(i<l){
                str = args[i];
                args[i] = args[j];
                args[j] = str;
                i++;
                j--;
            }
            

        }
    }
}