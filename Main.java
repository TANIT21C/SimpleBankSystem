public class Main {
    public static void main(String[] args) {

        // Create instances of BankAccount, SavingAccount, and CurrentAccount
        BankAccount bankAccount = new BankAccount(2000.0, "Apple", 1);

        SavingAccount savingAccount = new SavingAccount(3000.0, "John",2,  0.00005);
        

        CurrentAccount currentAccount = new CurrentAccount(50000.0, "Elane",3,  1000.0);

        // Deposit into the accounts
        bankAccount.deposit(500);

        // Withdraw from the accounts
        bankAccount.withdraw(200);
        currentAccount.withdraw(1000);  // This will use overdraft

        // Display the account information
        bankAccount.displayAccountInfo();
        savingAccount.displayAccountInfo();
        // Add interest to the saving account
        savingAccount.calInterest();
        
        currentAccount.displayAccountInfo();
        
        
    }
}
