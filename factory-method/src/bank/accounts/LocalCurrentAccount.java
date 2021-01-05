package bank.accounts;

public class LocalCurrentAccount extends Account {

    public LocalCurrentAccount(final double principalAmount) {
        super(principalAmount);
    }

    @Override
    public double getInterestRate() {
        return 5.0;
    }
}
