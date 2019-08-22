package com.loveason.leetcode.simple;


/**
 * @auther: alec
 * @date: 2018/8/2 10:45
 * @description: 颠倒二进制位
 */
public class T190 {
    public static void main(String[] args) {
        System.out.println(reverseBits(1));
    }

    private static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31) {
                result <<= 1;
            }
        }
        return result;
    }
}
