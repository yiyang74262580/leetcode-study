package com.loveason.leetcode.simple.lcci;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 01.01. 判定字符是否唯一
 * @author yangjie
 * @date 2020/8/19 13:45
 */
public class T0101 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(new T0101().isUnique(s));
    }

    public boolean isUnique(String astr) {
        Set<Character> s = new HashSet<>();
        char[] split = astr.toCharArray();
        for (char c : split) {
            if (s.contains(c)) {
                return false;
            } else {
                s.add(c);
            }
        }
        return true;
    }
}
