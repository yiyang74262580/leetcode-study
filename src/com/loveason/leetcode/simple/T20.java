package com.loveason.leetcode.simple;

import java.util.*;

/**
 * @author alec
 * @description 有效的括号
 * @date 22:03 2019/6/13
 */
public class T20 {
    public static void main(String[] args) {
//        String param = "()[]{}";
//        String param = "(]";
//        String param = "([)]";
//        String param = "{[]}";
//        String param = "((";
//        String param = "(()(";
//        String param = "(([]){})";
//        String param = "){";
//        String param = "()";
        String param = "(()])}[}[}[]][}}[}{})][[(]({])])}}(])){)((){";
        System.out.println(isValid(param));
    }

    private static boolean isValid(String s) {
        // 双引号算有效的括号
        if ("".equals(s)) {
            return true;
        }

        int length = s.length();
        // 如果s为奇数，则括号不可能匹配 false
        if (length % 2 != 0) {
            return false;
        }

        Map<String, String> hashMap = new HashMap<>(3);
        hashMap.put("(", ")");
        hashMap.put("[", "]");
        hashMap.put("{", "}");

        String[] split = s.split("");
        if (hashMap.containsValue(split[0])) {
            return false;
        }
        List<String> strings = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            int lastIndex = strings.size();
            int index = lastIndex - 1;
            // 如果是左括号，则添加到List里面去
            if (hashMap.containsKey(split[i])) {
                strings.add(split[i]);
            } else {
                // 如果List的size为0，则这个括号字符串是无效的
                if (lastIndex == 0) {
                    return false;
                }
                // 如果是右括号，则删除上一次添加的左括号，
                if (hashMap.get(strings.get(index)).equals(split[i])) {
                    strings.remove(index);
                }
            }
        }
        return strings.size() == 0;
    }
}
