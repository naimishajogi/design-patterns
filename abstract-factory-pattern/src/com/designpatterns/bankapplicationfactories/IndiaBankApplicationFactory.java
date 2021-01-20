package com.designpatterns.bankapplicationfactories;

import com.designpatterns.addressproof.AadharCard;
import com.designpatterns.addressproof.AddressProofInterface;
import com.designpatterns.identityproof.IdentityProofInterface;
import com.designpatterns.identityproof.PANCard;

public class IndiaBankApplicationFactory implements BankApplicationFactoryInterface{

    @Override
    public AddressProofInterface getAddressProofDocumentType() {
        return new AadharCard();
    }

    @Override
    public IdentityProofInterface getIdentityProofDocumentType() {
        return new PANCard();
    }
}
