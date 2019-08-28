package com.loveason.leetcode.simple;

import java.util.Date;
import java.util.Timer;

/**
 * @author alec
 * @description  x 的平方根
 * @date 11:14 2019/8/28
 */
public class T69 {
    public static void main(String[] args) {
//        int x = 4;
//        int x = 8;
        int x = 2147483647;
        int sqrt = mySqrt(x);
        System.out.println(sqrt);
    }

    /**
     * for (int i = 46340; i > 0; i--) {
     *     int tmp = i * i;
     *     if (tmp <= x) {
     *         return i;
     *     }
     * }
     * @param x
     * @return
     */
    private static int mySqrt(int x) {
        // int最大值的平方根 46340
        int tmp = 46340;
        while (tmp * tmp > x) {
            tmp--;
        }
        return tmp;
    }
}
