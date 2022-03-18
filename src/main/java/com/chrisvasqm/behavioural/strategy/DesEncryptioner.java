package com.chrisvasqm.behavioural.strategy;

public class DesEncryptioner implements Encryptioner {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting in DES");
    }
}
