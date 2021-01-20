package com.designpatterns.identityproof;

public class StateIDCard implements IdentityProofInterface{

    @Override
    public String getProofType() {
        return "State Identification type";
    }
}
