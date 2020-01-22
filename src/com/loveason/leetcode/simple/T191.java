package com.loveason.leetcode.simple;

/**
 * @author yangjie
 * @description 位1的个数
 * @date 16:44 2020/1/22
 */
public class T191 {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }

    private static int hammingWeight(int n) {
        // 转换为二进制char数组
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int k = 0;
        for (char c : chars) {
            if (1 == ((int)c - (int)('0'))) {
                k++;
            }
        }
        return k;
    }
}
