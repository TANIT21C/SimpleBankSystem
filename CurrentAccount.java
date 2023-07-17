public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double accountBalance, String accountHolderName, int accountNumber, double overdraftLimit) {
        super(accountBalance, accountHolderName, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= accountBalance + overdraftLimit) {
            if (amount > accountBalance) {
                double overdraftAmount = amount - accountBalance;
                accountBalance = 0;
                overdraftLimit -= overdraftAmount * 0.03; // Deduct 3% charge from the overdraft limit
            } else {
                accountBalance -= amount;
            }
        } else {
            System.out.println("Exceeded overdraft limit.");
        }
    }
}