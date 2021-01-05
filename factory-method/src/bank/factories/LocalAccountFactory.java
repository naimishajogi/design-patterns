package bank.factories;

import bank.factories.AccountFactory;
import bank.accounts.Account;
import bank.accounts.BankAccountType;
import bank.accounts.LocalCurrentAccount;
import bank.accounts.LocalSavingAccount;

public class LocalAccountFactory implements AccountFactory {

    @Override
    public Account createAccount(final BankAccountType accountType, final double amount) {
        if(BankAccountType.CURRENT_ACCOUNT.equals(accountType))
            return new LocalCurrentAccount(amount);
        else if(BankAccountType.SAVING_ACCOUNT.equals(accountType))
            return new LocalSavingAccount(amount);
        return null;
    }
}
