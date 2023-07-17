public class BankAccount {
    protected double accountBalance;
    private int accountNumber;
    private String accountHolderName;

    public BankAccount(double accountBalance, String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        
    }

    public void deposit (double amount) {
        accountBalance += amount;

    }

    public void withdraw (double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
        }else{
            System.out.println("Insufficient funds");
        }
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getAccountBalance(){
        return accountBalance;
    }
    public void displayAccountInfo(){
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
}