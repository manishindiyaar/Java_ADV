

abstract class Tree{
    abstract void getType(){
        System.out.println("I undergo photosynthesis");
    }
}


public class Mango extends Tree{
    public void getType(){
        System.out.println("Implemented in Mango Class");

    }
};  

public class JackFruit extends Tree{
    public void getType(){
        System.out.println("Implemented in JackFruit Class")
    }
};

