package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/20.
 */
public class CountOnesFromANum {

    public static void main(String[] args) {
        int n = 1;
        int result = 0;
        long s = System.currentTimeMillis();
        while (n <= 100000000) {
            result += getOnesFromANum(n);
            n++;
        }
        System.out.println(result);
        System.out.println((System.currentTimeMillis() - s));
    }

    public static int getOnesFromANum(int num) {
        int count = 0;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
