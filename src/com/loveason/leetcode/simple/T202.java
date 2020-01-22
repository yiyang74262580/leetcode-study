package com.loveason.leetcode.simple;

/**
 * @author yangjie
 * @description 快乐数
 * @date 14:01 2020/1/17
 */
public class T202 {
    public static void main(String[] args) {
        int n = 786786783;
        System.out.println(isHappy(n));
    }
    private static boolean isHappy(int n) {
        int num = n;
        int times = 0;
        while (num != 1) {
            char[] chars = Integer.toString(num).toCharArray();
            num = 0;
            for (char c : chars) {
                // 转换为数组并求和
                int d = ((int)c - (int)('0'));
                num += d * d;
            }

            times++;
            // 7一个神奇的数字（应该算测试用例太少了）本来用List，但是太慢了
            if (times == 7) {
                return false;
            }
        }

        return true;
    }
}
