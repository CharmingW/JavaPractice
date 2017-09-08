package com.charmingwong;

import java.util.Stack;

/**
 * Created by CharmingWong on 2017/4/21.
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("将月份压入栈");
        for (int i = 1; i <= 12; i++) {
            stack.push(i + " mothon");
            System.out.println(i + " mothon");
        }
        int size = stack.size();
        System.out.println("将月份弹出栈");
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }
    }
}
