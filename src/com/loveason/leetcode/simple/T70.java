package com.loveason.leetcode.simple;

/**
 * @author alec
 * @description 爬楼梯
 * @date 13:19 2019/8/28
 */
public class T70 {
    public static void main(String[] args) {
        int n = 8;
        int stairs = climbStairs(n);
        System.out.println(stairs);
    }

    private static int climbStairs(int n) {
        int x = 1, y = 2;
        if (n == 1 || n == 2) {
            return n;
        }
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = x + y;
            x = y;
            y = result;
        }
        return result;
    }
}
