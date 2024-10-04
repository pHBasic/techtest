package com.ph.techtest.api.enums;

public enum AccountType {
    CORRENTE("corrente"),
    POUPANCA("poupanca");

    private String desc;

    AccountType(String desc){
        this.desc = desc;
    }

     public String getDesc(){
        return desc;
     }   
}
