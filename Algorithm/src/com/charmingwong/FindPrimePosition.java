package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/20.
 */
public class FindPrimePosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            findPrimePosition(scanner.nextInt());
        }
    }

    public static void findPrimePosition(int n) {
        int[] arr = new int[n + 1];
        int position = 1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = position++;
                for (int j = i + i; j < arr.length; j += i) {
                    if (arr[j] == 0) {
                        arr[j] = arr[i];
                    }
                }
            }
            if (arr[n] != 0) {
                System.out.println(arr[n]);
                return;
            }
        }
    }
}
