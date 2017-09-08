package com.charmingwong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by CharmingWong on 2017/4/20.
 */
public class FindMostChar {

    public static void main(String[] args) {

        String s = "ffdhljfjdsljfdsefdserbeeeaasfe";
        char[] chars = s.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        for (char aChar : chars) {
            list.add(String.valueOf(aChar));
            set.add(String.valueOf(aChar));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String aList : list) {
            sb.append(aList);
        }
        ArrayList<String> maxList = new ArrayList<>();
        String ss = sb.toString();
        String maxString = "";
        int max = 0;
        for (Object o : set) {
            String os = (String) o;
            int start = ss.indexOf(os);
            int end = ss.lastIndexOf(os);
            int m = end - start + 1;
            if (m > max) {
                maxString = os;
                max = m;
                maxList.add(os);
            } else if (m == max) {
                maxList.add(os);
            }
        }

        int index = maxList.indexOf(maxString);
        for (int i = index; i < maxList.size(); i++) {
            System.out.println(maxList.get(i));
        }
        System.out.println(max);
    }
}
