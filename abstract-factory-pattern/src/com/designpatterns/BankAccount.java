package com.designpatterns;

import com.designpatterns.addressproof.AddressProofInterface;
import com.designpatterns.bankapplicationfactories.BankApplicationFactoryInterface;
import com.designpatterns.identityproof.IdentityProofInterface;

public class BankAccount {

    private AddressProofInterface addressProof;
    private IdentityProofInterface identityProof;

    public BankAccount(BankApplicationFactoryInterface applicationFactory) {
        addressProof = applicationFactory.getAddressProofDocumentType();
        identityProof = applicationFactory.getIdentityProofDocumentType();
    }

    public String getAddressProofType() {
        return addressProof.getProofType();
    }

    public String getIdentityProofType() {
        return identityProof.getProofType();
    }
}
