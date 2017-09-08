package com.charmingwong;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by CharmingWong on 2017/5/4.
 */
public class BASE64 {

    public static void main(String[] args) throws IOException {
        String message = "hello world";
        System.out.println("Base64加密前：" + message);

        BASE64Encoder encoder = new BASE64Encoder();
        String encrypted = encoder.encodeBuffer(message.getBytes());
        System.out.println("Base64加密后：" + encrypted);

        BASE64Decoder decoder = new BASE64Decoder();
        String decrypted = new String(decoder.decodeBuffer(encrypted));
        System.out.println("Base64解密后：" + decrypted);
    }
}
