package com.loveason.leetcode.simple;

/**
 * @author alec
 * @description 罗马数字转整数
 * @date 16:55 2019/5/24
 */
public class T13 {
    public static void main(String[] args) {
        System.out.println("结果：" + romanToInt("XXVII"));
    }

    private static int romanToInt(String s) {
        String[] strings = s.split("");
        int num = 0;
        boolean flag = true;
        int length = strings.length;
        for (int i = 0; i < length; i++) {
            String tmp = strings[i];
            if (i == length - 1) {
                flag = false;
            }

            if ("I".equals(tmp)) {
                if (flag) {
                    if ("V".equals(strings[i + 1])) {
                        i += 1;
                        num += 4;
                    } else if ("X".equals(strings[i + 1])) {
                        i += 1;
                        num += 9;
                    } else {
                        num += 1;
                    }
                } else {
                    num += 1;
                }

            } else if ("V".equals(tmp)) {
                num += 5;
            } else if ("X".equals(tmp)) {
                if (flag) {
                    if ("L".equals(strings[i + 1])) {
                        i += 1;
                        num += 40;
                    } else if ("C".equals(strings[i + 1])) {
                        i += 1;
                        num += 90;
                    } else {
                        num += 10;
                    }
                } else {
                    num += 10;
                }

            } else if ("L".equals(tmp)) {
                num += 50;
            } else if ("C".equals(tmp)) {
                if (flag) {
                    if ("D".equals(strings[i + 1])) {
                        i += 1;
                        num += 400;
                    } else if ("M".equals(strings[i + 1])) {
                        i += 1;
                        num += 900;
                    } else {
                        num += 100;
                    }
                } else {
                    num += 100;
                }

            } else if ("D".equals(tmp)) {
                num += 500;
            } else if ("M".equals(tmp)) {
                num += 1000;
            }
        }
        return num;
    }
}
