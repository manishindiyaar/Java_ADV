interface MyInterface {
    int x = 10;   // public static final by default
}

public class InterfaceVsClassDemo {
    public static void main(String[] args) {
        System.out.println(MyInterface.x);
    }
}