package com.loveason.leetcode.simple;

import java.util.Stack;

/**
 * @auther: alec
 * @date: 2018/8/2 18:54
 * @description: 回文数
 */
public class T9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    private static boolean isPalindrome(int x) {
        // 负数不是回文数
        if (x < 0) {
            return false;
        }
        Stack<Integer> result = new Stack<>();
        do {
            result.push(x % 10);
            x /= 10;
        }
        while (x > 0);
        Object[] array = result.toArray();

        int length = array.length;

        for (int i = 0; i < length; i++) {
            if (array[i].equals(array[length - 1])) {
                length--;
            } else {
                return false;
            }
        }

        return true;
    }
}
