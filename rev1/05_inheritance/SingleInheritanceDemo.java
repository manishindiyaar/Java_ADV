

class Book{
    float price;    
    void showPrice(){
        System.out.println("Price : "+ price);
    }


}
class JavaBook extends Book{
    String title;
    
    void showTitle(){
        System.out.println("Title : " +title);
    }
}

public class SingleInheritanceDemo{
    public static void main(String[] args){
        JavaBook jb = new JavaBook();
        jb.title = "Java Complete Reference";
        jb.price = 560;

        jb.showTitle();
        jb.showPrice();
    }
}