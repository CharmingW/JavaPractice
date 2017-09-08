package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/20.
 */
public class RecursiveExclDulTest {

    static int count = 0;

    public static void main(String[] args) {
        listAll("1224", "");
        System.out.println(count);
    }

    static void listAll(String s, String prefix) {
        if (s.length() < 1) {
            count++;
            System.out.println(prefix);
        } else {
            int[] index = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                index[i] = s.indexOf(s.charAt(i));
            }
            for (int i = 0; i < s.length(); i++) {
                if (index[i] == i) {
                    listAll(s.substring(1), prefix + s.substring(0, 1));
                }
                s = s.substring(1) + s.substring(0, 1);
            }
        }
    }
}
