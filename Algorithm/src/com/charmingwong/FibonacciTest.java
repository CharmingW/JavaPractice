package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/20.
 */
public class FibonacciTest {

    static int sum = 0;
    static int k = 0;

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        sum += result;
        System.out.println("第" + n + "个数为：" + result);
        System.out.println("前" + n + "个数和为：" + sum);
        System.out.println("共调用了" + k + "次");
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            k++;
            sum++;
            return 1;
        } else {
            int temp = fibonacci(n - 1) + fibonacci(n - 2);
            sum += temp;
            return temp;
        }
    }
}
