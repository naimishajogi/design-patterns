package bank.factories;

import bank.accounts.Account;
import bank.accounts.BankAccountType;

public interface AccountFactory {

    Account createAccount(BankAccountType accountType, double amount);
}
