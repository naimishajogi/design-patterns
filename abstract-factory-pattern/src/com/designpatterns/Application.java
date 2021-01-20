package com.designpatterns;

import com.designpatterns.bankapplicationfactories.BankApplicationFactoryInterface;
import com.designpatterns.bankapplicationfactories.BankApplicationFactoryProvider;
import com.designpatterns.bankapplicationfactories.Location;

public class Application {

    public static void main(String[] args) {
        BankApplicationFactoryInterface USABankApplication = BankApplicationFactoryProvider.getFactory(Location.USA);
        BankAccount usaBankAccount = new BankAccount(USABankApplication);
        System.out.println(String.format("USA Bank Account, Identity proof type: %s, Address Proof : %s", usaBankAccount.getIdentityProofType(), usaBankAccount.getAddressProofType()));

        BankApplicationFactoryInterface IndiaBankApplication = BankApplicationFactoryProvider.getFactory(Location.INDIA);
        BankAccount indiaBankAccount = new BankAccount(IndiaBankApplication);
        System.out.println(String.format("India Bank Account, Identity proof type: %s, Address Proof : %s", indiaBankAccount.getIdentityProofType(), indiaBankAccount.getAddressProofType()));
    }
}
