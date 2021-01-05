package bank.accounts;

public class LocalSavingAccount extends Account {

    public LocalSavingAccount(final double principalAmount) {
        super(principalAmount);
    }

    @Override
    public double getInterestRate() {
        return 7.5;
    }
}
