package bank.accounts;

public abstract class Account {

    private double principalAmount;

    public Account(final double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public abstract double getInterestRate();

    public double calculateSimpleInterest(int year) {
        double interest = getInterestRate();
        return (this.principalAmount * interest * year) / 100;
    }

    public double getPrincipalAmount() {
        return principalAmount;
    }
}
