package com.charmingwong;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by CharmingWong on 2017/5/4.
 */
public class SHA {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String message = "hello world";
        System.out.println("MD5加密前：" + message);
        MessageDigest digest = MessageDigest.getInstance("SHA");
        digest.update(message.getBytes());
        byte[] data = digest.digest();
        System.out.println("MD5加密后：");
        for (byte datum : data) {
            System.out.format("%x", datum);
        }
    }
}
