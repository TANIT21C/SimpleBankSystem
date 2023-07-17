public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(double accountBalance, String accountHolderName, int accountNumber, double interestRate) {
        super( accountBalance, accountHolderName, accountNumber);
        this.interestRate = interestRate;
    }

    public double calInterest() {
        double interest = getAccountBalance() * interestRate;
        System.out.println("Interest earned: "+ interest);
        return interest;
    }

    @Override
    public void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate);
    }
}
