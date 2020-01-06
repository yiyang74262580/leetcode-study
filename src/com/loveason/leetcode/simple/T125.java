package com.loveason.leetcode.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yangjie
 * @description 验证回文串
 * @date 20:28 2020/1/4
 */
public class T125 {

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        String s = ".";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if ("".equals(s.trim())) {
            return true;
        }
        char[] chars = s.toCharArray();

        // 使用原数组保存新数组的值（都为字母或者数字）
        // 数组的下标
        int index = 0;
        // 剩余的字符长度
        int remainder = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                chars[index] = chars[i];
                index++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[index] = Character.toLowerCase(chars[i]);
                index++;
            } else if(chars[i] >= 'a' && chars[i] <= 'z') {
                chars[index] = chars[i];
                index++;
            } else {
                remainder++;
            }
        }
        if (index == 0) {
            return true;
        }

        // 总字母或数字的长度
        int length = chars.length - remainder;
        // 总长度的一半
        int mid = length / 2;
        for (int i = 0; i < length; i++) {
            if (chars[i] == chars[length - 1 - i]) {
                if (i == mid) {
                    return true;
                }
            } else {
                return false;
            }
        }

        return false;
    }
}
