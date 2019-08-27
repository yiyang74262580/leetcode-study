package com.loveason.leetcode.simple;

/**
 * @author alec
 * @description 最后一个单词的长度
 * @date 13:40 2019/8/27
 */
public class T58 {
    public static void main(String[] args) {
//        String s = "Hello World";
//        String s = "";
//        String s = "a";
        String s = "a ";
        int length = lengthOfLastWord(s);
        System.out.println(length);
    }

    private static int lengthOfLastWord(String s) {
        s = s.trim();
        if ("".equals(s)) {
            return 0;
        }
        int lastIndex = s.lastIndexOf(" ");
        if (lastIndex == -1) {
            return s.length();
        }
        return s.substring(lastIndex, s.length() - 1).length();
    }
}
