abstract class Bank {
    abstract void interestRate();
}

class SBI extends Bank {
    void interestRate() {
        System.out.println("SBI Interest Rate: 6%");
    }
}

class HDFC extends Bank {
    void interestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class RuntimeAbstractionDemo {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();
    }
}