package com.designpatterns.addressproof;

public class AadharCard implements AddressProofInterface {

    @Override
    public String getProofType() {
        return "Aadhar Card";
    }
}
