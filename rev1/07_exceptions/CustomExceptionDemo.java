class InvalidBalanceException extends Exception {
    InvalidBalanceException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {

    static void withdraw(int balance, int amount) throws InvalidBalanceException {

        if (amount > balance) {
            throw new InvalidBalanceException("Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);
        } catch (InvalidBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}