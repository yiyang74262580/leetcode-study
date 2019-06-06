package com.loveason.leetcode.simple;

/**
 * @author: alec
 * @date: 2018/8/2 10:01
 * @description: 整数反转
 */
public class T7 {
    public static void main(String[] args) {
        System.out.println(test(1234));
    }

    private static int test(int num) {
        String value = String.valueOf(num);
        String[] split = value.split("");
        String[] strings;
        String temp = value;
        String t;
        switch (split[0]) {
            case "-":
                strings = new String[split.length - 1];
                temp = temp.substring(1, split.length);
                split = temp.split("");
                t = "-";
                break;
            case "+":
                strings = new String[split.length - 1];
                temp = temp.substring(1, split.length);
                split = temp.split("");
                t = "";
                break;
            default:
                strings = new String[split.length];
                t = "";
                break;
        }

        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(t);
        for (int i = split.length - 1; i >= 0; i--) {
            strings[i] = split[i];
            stringBuffer.append(strings[i]);
        }

        int anInt = 0;
        try {
            anInt = Integer.parseInt(stringBuffer.toString());
        }catch (Exception e){
            e.printStackTrace();
        }

        return anInt;
    }
}
