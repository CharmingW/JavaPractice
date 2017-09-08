package com.charmingwong;

import javafx.scene.media.SubtitleTrack;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.text.Keymap;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by CharmingWong on 2017/5/4.
 */
public class HMAC {

    public static final String KEY_MAC = "HmacMD5";

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        String message = "hello world";
        System.out.println("加密前：" + message);

        byte[] key = new BASE64Decoder().decodeBuffer(initMacKey());
        for (byte b : key) {
            System.out.format("%x", b);
        }
        System.out.println();
        SecretKey secretKey = new SecretKeySpec(key, KEY_MAC);
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        mac.init(secretKey);
        String encrypted = new String(mac.doFinal());
        System.out.println("加密后：" + encrypted);


    }

    public static String initMacKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_MAC);
        SecretKey secretKey = keyGenerator.generateKey();
        byte[] key = secretKey.getEncoded();
        for (byte b : key) {
            System.out.format("%x", b);
        }
        System.out.println();
        return new BASE64Encoder().encodeBuffer(key);
    }
}
