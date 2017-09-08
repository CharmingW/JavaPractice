package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/29.
 */
public class Person {

    void walk(int distance) {
        String s;
        StringBuffer sb;
        StringBuilder sbb;
    }

    void walk(int distance, int duration) {
    }

    void walk(int instance, String direction) {
    }


}

class Student extends Person {
    @Override
    void walk(int distance) {
        System.out.println("go to school");
    }
}

