package com.loveason.leetcode.simple;

/**
 * @author alec
 * @description 实现 strStr()
 * @date 23:18 2019/8/22
 */
public class T28 {
    public static void main(String[] args) {
//        String haystack = "hello", needle = "ll";
//        String haystack = "aaaaa", needle = "bba";
//        String haystack = "a", needle = "a";
//        String haystack = "aaa", needle = "a";
//        String haystack = "mississippi", needle = "issi";
//        String haystack = "mississippi", needle = "issip";
//        String haystack = "mississippi", needle = "issipi";
        String haystack = "mississippi", needle = "pi";
//        String haystack = "mississippi", needle = "sippj";
//        String haystack = "aabaaaababaababaa", needle = "bbbb";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }

    private static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int index = 0;
        int needleLength = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(index)) {
                if (i + needleLength <= haystack.length()) {
                    if (haystack.substring(i, i + needleLength).equals(needle)) {
                        return i;
                    }
                }
            }
        }

        index = -1;
        return index;
    }
}
