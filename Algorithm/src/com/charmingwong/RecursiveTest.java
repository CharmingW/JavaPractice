package com.charmingwong;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by CharmingWong on 2017/4/20.
 */
public class RecursiveTest {

    static int count = 0;

    public static void main(String[] args) {
        String[] arr = new String[]{"1", "2", "3", "4"};
        listAll(Arrays.asList(arr), "");
        System.out.println(count);
    }

    public static void listAll(List candidate, String prefix) {
        if (candidate.isEmpty()) {
            System.out.println(prefix);
            count++;
        } else {
            for (int i = 0; i < candidate.size(); i++) {
                List temp = new LinkedList(candidate);
                listAll(temp, prefix + temp.remove(i));
            }
        }
    }
}
