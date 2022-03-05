package com.chrisvasqm.exercises.strategy;

public class AesEncryptioner implements Encryptioner {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting in AES");
    }
}
