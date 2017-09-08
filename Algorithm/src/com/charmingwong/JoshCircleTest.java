package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/22.
 */
public class JoshCircleTest {

    public static void main(String[] args) {
        boolean[] arr = new boolean[30];
        findJoshCircleTest(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("一共" + count + "个");
    }

    public static void findJoshCircleTest(boolean[] arr) {
        int count = 0;
        int leftNum = arr.length;
        int index = 0;
        while (true) {
            while (!arr[index]) {
                count++;
                if (count == 9) {
                    arr[index] = !arr[index];
                    leftNum--;
                    count = 0;
                    break;
                }
                index++;
                if (index >= arr.length) {
                    index = 0;
                }
            }
            index++;
            if (index >= arr.length) {
                index = 0;
            }
            if (leftNum <= 15) {
                break;
            }
        }
    }
}
