package com.charmingwong;

import java.lang.reflect.Method;

/**
 * Created by CharmingWong on 2017/4/17.
 */
public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("com.charmingwong.Model");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
