package com.designpatterns.bankapplicationfactories;

import java.util.function.Supplier;

public enum Location {
    USA(USABankApplicationFactory::new),
    INDIA(IndiaBankApplicationFactory::new);

    Supplier<BankApplicationFactoryInterface> applicationFactoryInterfaceSupplier;

    Location(final Supplier<BankApplicationFactoryInterface> applicationFactoryInterfaceSupplier) {
        this.applicationFactoryInterfaceSupplier = applicationFactoryInterfaceSupplier;
    }

    public Supplier<BankApplicationFactoryInterface> getApplicationFactoryInterfaceSupplier() {
        return applicationFactoryInterfaceSupplier;
    }
}
