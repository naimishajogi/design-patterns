package com.designpatterns.bankapplicationfactories;

import com.designpatterns.addressproof.AddressProofInterface;
import com.designpatterns.identityproof.IdentityProofInterface;

public interface BankApplicationFactoryInterface {
    AddressProofInterface getAddressProofDocumentType();
    IdentityProofInterface getIdentityProofDocumentType();
}
