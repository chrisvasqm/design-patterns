package com.chrisvasqm.exercises_part1.strategy;

public class DesEncryptioner implements Encryptioner {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting in DES");
    }
}
