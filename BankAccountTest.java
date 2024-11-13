/* Elias Grayson */
/* This class tests whether the BankAccount class is working properly */
public class BankAccountTest extends BankAccount {

    // Instantiates the same constructor as BankAccount
    public BankAccountTest(String accNum, double bal) {
        super(accNum, bal);
    }

    // This method is the method used for testing
    public static void main(String[] args) {

        //Bank Account x1 tests the BankAccuont
        BankAccount x1 = new BankAccount("x1", 110.99);
        x1.deposit(59.01);
        x1.withdraw(30.50);

        // Bank Account x2 tests if balance displays 0 when the user withdraws more than their balance
        BankAccount x2 = new BankAccount("x2", 3.99);
        x2.deposit(0.01);
        x2.withdraw(30.50);

        // Bank Account x3 tests another smaller case
        BankAccount x3 = new BankAccount("x3", 12.99);
        x3.deposit(37.01);
        x3.withdraw(0.50);
        System.out.println("This is the final balance of Account x1: " + x1.getBalance());
        System.out.println("This is the final balance of Account x2: " + x2.getBalance());
        System.out.println("This is the final balance of Account x3: " + x3.getBalance());
    }
}


