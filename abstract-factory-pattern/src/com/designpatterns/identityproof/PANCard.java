package com.designpatterns.identityproof;

public class PANCard implements IdentityProofInterface{

    @Override
    public String getProofType() {
        return "PAN Card";
    }
}
