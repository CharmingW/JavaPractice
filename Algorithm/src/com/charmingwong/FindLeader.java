package com.charmingwong;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by CharmingWong on 2017/4/22.
 */
public class FindLeader {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 3, 3, 3, 5, 5, 3, 3, 5, 2, 3, 3, 3, 3, 7, 8, 6, 3, 5, 4, 3, 3};
        int[] arr = {1};
        int index = findLeaderByHashSet(arr);
        if (index != -1) {
            System.out.println(arr[index]);
        }
    }

    public static int findLeader(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int count = 1;
        if (arr.length == 1) {
            return 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (count / ((double) len) > 0.5f) {       //判断是否
                    return i;
                }
            } else {
                count = 1;
            }
        }
        return -1;
    }

    public static int findLeaderByHashSet(int[] arr) {
        int len = arr.length;
        int count;
        HashSet<Integer> notLeaders = new HashSet<>();
        for (int i = 0; i < len; i++) {
            count = 1;
            if (notLeaders.contains(arr[i])) {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count / ((double) len) > 0.5) {
                return i;
            }
            notLeaders.add(arr[i]);
        }
        return -1;
    }
}
