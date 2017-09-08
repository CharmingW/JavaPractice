package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/21.
 */
public class FindPrimeBySqrt {

    public static void main(String[] args) {
        findPrime(100);
    }

    public static void findPrime(int n) {
        int i, j, k, count = 0;
        for (i = 2; i < n; i++) {
            k = (int) Math.sqrt(i);
            for (j = 2; j <= k; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > k) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("一共有" + count+"个素数");
    }
}
