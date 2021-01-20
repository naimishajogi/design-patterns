package com.designpatterns.bankapplicationfactories;

import com.designpatterns.addressproof.AddressProofInterface;
import com.designpatterns.addressproof.DriverLicense;
import com.designpatterns.identityproof.IdentityProofInterface;
import com.designpatterns.identityproof.StateIDCard;

public class USABankApplicationFactory implements BankApplicationFactoryInterface{

    @Override
    public AddressProofInterface getAddressProofDocumentType() {
        return new DriverLicense();
    }

    @Override
    public IdentityProofInterface getIdentityProofDocumentType() {
        return new StateIDCard();
    }
}
