package bank.accounts;

public class ForeignSavingAccount extends Account {

    public ForeignSavingAccount(final double principalAmount) {
        super(principalAmount);
    }

    @Override
    public double getInterestRate() {
        return 10.0;
    }
}
