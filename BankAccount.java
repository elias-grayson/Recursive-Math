/* Elias Grayson */
/* This class creates a bank account for the user */
public class BankAccount {
    
    private String accNum; // This stores the account number
    private double bal; // This stores the account balance

    // This constructor instantiates the account number and balance
    public BankAccount(String accNum, double bal) {
        this.accNum = accNum;
        this.bal = bal;
    }

    // This method allows the user to deposit money into their account
    public void deposit(double d) {
        bal = bal + d;
    }

    // This method allows the user to withdraw money from their account
    public double withdraw(double w) {
        // Makes sure that the user cannot withdraw more money than they have
        if (w > bal) {
            bal = 0;
            return bal;
        }

        else {
            bal = bal - w;
            return bal;
        }
    }

    // Returns the user's balance
    public double getBalance() {
        return bal;
    }

}
