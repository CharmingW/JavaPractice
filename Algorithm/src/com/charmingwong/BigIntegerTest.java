package com.charmingwong;

import java.math.BigInteger;

/**
 * Created by CharmingWong on 2017/4/22.
 */
public class BigIntegerTest {

    public static void main(String[] args) {
        bigIntegerTest();
    }

    public static void bigIntegerTest() {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger c = new BigInteger("3");
        BigInteger sum = new BigInteger("0");
        sum = sum.add(a);
        sum = sum.add(b);
        sum = sum.add(c);
        System.out.println(sum.toString());
    }
}
