package bank;

import bank.accounts.Account;
import bank.accounts.BankAccountType;
import bank.factories.AccountFactory;

public class Branch {
    private AccountFactory accountFactory;

    public Branch(final AccountFactory accountFactory) {
        this.accountFactory = accountFactory;
    }

    public Account createAccount(BankAccountType type, double amount) {
        return accountFactory.createAccount(type, amount);
    }
}
