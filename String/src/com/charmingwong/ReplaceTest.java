package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/22.
 */
public class ReplaceTest {

    public static void main(String[] args) {
        String s = "dfskhf23j44j3j32hjlk4j3jh3424242jljjsj";
//        Pattern p = Pattern.compile("[0-9]");
//        Matcher matcher = p.matcher(s);
//        StringBuilder stringBuilder = new StringBuilder();
//        while (matcher.find()) {
//            stringBuilder.append(matcher.group());
//        }
//        System.out.println(stringBuilder.toString());
        System.out.println(s.replaceAll("[^0-9]", ""));
    }
}
