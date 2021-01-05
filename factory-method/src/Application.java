import bank.Branch;
import bank.accounts.Account;
import bank.accounts.BankAccountType;
import bank.Branch;
import bank.factories.*;

public class Application {

    public static void main(String[] args) {

        Branch b1 = new Branch(new LocalAccountFactory());
        Account localCurrentAccount = b1.createAccount(BankAccountType.CURRENT_ACCOUNT, 1000);
        Account localSavingAccount = b1.createAccount(BankAccountType.SAVING_ACCOUNT, 1000);

        Branch b2 = new Branch(new ForeignAccountFactory());
        Account foreignCurrentAccount = b2.createAccount(BankAccountType.CURRENT_ACCOUNT, 1000);
        Account foreignSavingAccount = b2.createAccount(BankAccountType.SAVING_ACCOUNT, 1000);

        System.out.println(String.format("Local Current Account, account : %s, interest of one year: %s", localCurrentAccount.getPrincipalAmount(), localCurrentAccount.calculateSimpleInterest(1)));
        System.out.println(String.format("Local Saving Account, account : %s, interest of one year: %s", localSavingAccount.getPrincipalAmount(), localSavingAccount.calculateSimpleInterest(1)));
        System.out.println(String.format("Foreign Current Account, account : %s, interest of one year: %s", foreignCurrentAccount.getPrincipalAmount(), foreignCurrentAccount.calculateSimpleInterest(1)));
        System.out.println(String.format("Foreign Current Account, account : %s, interest of one year: %s", foreignSavingAccount.getPrincipalAmount(), foreignSavingAccount.calculateSimpleInterest(1)));
    }
}
