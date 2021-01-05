package bank.factories;

import bank.factories.AccountFactory;
import bank.accounts.Account;
import bank.accounts.BankAccountType;
import bank.accounts.ForeignCurrentAccount;
import bank.accounts.ForeignSavingAccount;

public class ForeignAccountFactory implements AccountFactory {

    @Override
    public Account createAccount(final BankAccountType accountType, final double amount) {
        if(BankAccountType.SAVING_ACCOUNT.equals(accountType))
            return new ForeignSavingAccount(amount);
        else if(BankAccountType.CURRENT_ACCOUNT.equals(accountType))
            return new ForeignCurrentAccount(amount);
        return null;
    }
}
