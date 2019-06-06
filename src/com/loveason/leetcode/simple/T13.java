package com.loveason.leetcode.simple;

/**
 * @author alec
 * @description 罗马数字转整数
 * @date 16:55 2019/5/24
 */
public class T13 {
    public static void main(String[] args) {
        romanToInt("XXVII");
    }

    private static int romanToInt(String s) {
        String[] strings = s.split("");
        int num = 0;
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);

            if (i == strings.length - 1) {
                return 0;
            }

            if ("I".equals(strings[i])) {
                if ("V".equals(strings[i + 1])) {
                    i += 2;
                    num += 4;
                } else if ("X".equals(strings[i + 1])) {
                    i += 2;
                    num += 9;
                } else {
                    num += 1;
                }
            } else if ("V".equals(strings[i])) {
                num += 5;
            } else if ("X".equals(strings[i])) {
                if ("L".equals(strings[i + 1])) {
                    i += 2;
                    num += 40;
                } else if ("C".equals(strings[i + 1])) {
                    i += 2;
                    num += 90;
                } else {
                    num += 10;
                }
            } else if ("L".equals(strings[i])) {
                num += 50;
            } else if ("C".equals(strings[i])) {
                if ("D".equals(strings[i + 1])) {
                    i += 2;
                    num += 400;
                } else if ("M".equals(strings[i + 1])) {
                    i += 2;
                    num += 900;
                } else {
                    num += 100;
                }
            } else if ("D".equals(strings[i])) {
                num += 500;
            } else if ("M".equals(strings[i])) {
                num += 1000;
            }
        }
        System.out.println("结果：" + num);
        return 0;
    }
}
