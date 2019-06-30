package com.loveason.leetcode.simple;

/**
 * @author alec
 * @description 最长公共前缀
 * @date 1:48 2019/6/9
 */
public class T14 {
    public static void main(String[] args) {
        String[] strs = {"aaa","aa","aaa"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int length = strs.length;
        // 空数组
        if (length == 0) {
            return "";
        }
        // 数组中只有一个元素
        if (length == 1) {
            return strs[0];
        }

        String top = strs[0];

        int min = top.length();
        String minStr = top;

        for (String str : strs) {
            if (min > str.length()) {
                min = str.length();
                minStr = str;
            }
        }

        // 字符的下标
        int index = 0;
        // 最终字符的长度
        int len = 0;
        char t = 0;
        // 不能超过最小长度，提高效率
        for (int i = 0; i < min; i++) {
            for (String str : strs) {
                // 如果长度最小的字符串的每个字符和每一个元素的每一个字符相等
                if (minStr.charAt(index) == str.charAt(index)) {
                    t++;
                }
            }
            index++;
            // 如果长度最小的字符串的每一个字符跟后面的字符串的每一个字符相等，
            if (t == length * index) {
                len++;
            }
        }

        // 从最小长度的字符串中按下标依次取出
        for (int i = 0; i < len; i++) {
            result.append(minStr.charAt(i));
        }

        return result.toString();
    }
}
