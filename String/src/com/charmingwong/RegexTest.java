package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/22.
 */
public class RegexTest {

    public static void main(String[] args) {
        char a[][];
        char []b;
        String s = "2017-04-22 09:29:30";
//        System.out.println(s.replaceAll("-| |:", ""));
//        System.out.println(s.replaceAll("[^0-9]", ""));
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = s.split("\\D");
        for (String string : strings) {
            stringBuilder.append(string);
        }
        System.out.println(stringBuilder.toString());
    }
}
