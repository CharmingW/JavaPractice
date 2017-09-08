package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/20.
 */
public class FindPrime {

    public static void main(String[] args) {
        int[] arr = findPrime(100);
        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static int[] findPrime(int n) {
        int[] arr = new int[n + 1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != 1) {
                for (int j = i + i; j < arr.length; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return arr;
    }
}
