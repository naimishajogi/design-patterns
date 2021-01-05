package bank.accounts;

public class ForeignCurrentAccount extends Account {

    public ForeignCurrentAccount(final double principalAmount) {
        super(principalAmount);
    }

    @Override
    public double getInterestRate() {
        return 8.0;
    }
}
