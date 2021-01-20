package com.designpatterns.addressproof;

public class DriverLicense implements AddressProofInterface {

    @Override
    public String getProofType() {
        return "Driver License";
    }
}
