

// Basic Constructor


public class ConstTry {

    // Simple constructor
    public ConstTry() {
        System.out.println("Constructor is running...");
    }


    }


    // A non static function cannot be called from static reference.
    // Hence we cannot call y() from main method.

    // Hovever static func can be called from other static methods.

    // Also a non-static func can a call static func.

public class A{

        //static func
        public static void x(){
            System.out.println("Its from x ");
        }

        public void y(){
        System.out.println("Its form y");
    }

    public static void main(String[] args) {
        // Creating an object calls the constructor automatically
        ConstTry obj = new ConstTry();
        x();
        //call new created method x and y in class A



    }
}
