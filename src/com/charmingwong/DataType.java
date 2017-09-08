package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/28.
 */
public class DataType {

    public static void main(String[] args) {
        int i = Integer.parseInt("1");
        int i1 = Integer.valueOf("1");
        int i2 = Integer.valueOf('1');  //输出字符'1'的ASCII值

        System.out.println(i + "" + i1 + i2);
    }
}
