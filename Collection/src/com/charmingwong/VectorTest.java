package com.charmingwong;

import java.util.Vector;

/**
 * Created by CharmingWong on 2017/4/21.
 */
public class VectorTest {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        System.out.println("将月份入队");
                for (int i = 1; i <= 12; i++) {
            vector.addElement(i + " mothon");
            System.out.println(i + " mothon");
        }
        System.out.println("将月份出队");
        for (int i = 0; i < 12; i++) {
            System.out.println(vector.lastElement());
            vector.remove(vector.lastElement());
        }
    }
}
