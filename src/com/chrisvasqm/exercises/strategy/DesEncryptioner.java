package com.chrisvasqm.exercises.strategy;

public class DesEncryptioner implements Encryptioner {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting in DES");
    }
}
