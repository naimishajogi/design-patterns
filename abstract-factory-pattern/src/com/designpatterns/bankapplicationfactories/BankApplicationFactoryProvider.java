package com.designpatterns.bankapplicationfactories;

public class BankApplicationFactoryProvider {
    public static BankApplicationFactoryInterface getFactory(Location location){
        return location.getApplicationFactoryInterfaceSupplier().get();
    }
}
