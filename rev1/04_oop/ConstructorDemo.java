

class Book{
    String title;

    Book(){
        title = "Java Basics";

    }

    void show(){
        System.out.println("Title : " +title);
    }
}

public class ConstructorDemo{
    public static void main(String[] args){
        Book b = new Book();
        b.show();
    }
}