package com.loveason.leetcode.simple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author alec
 * @description 加一
 * @date 16:17 2019/8/27
 */
public class T66 {
    public static void main(String[] args) {
//        int[] digits = {1,2,9};
//        int[] digits = {8,9,9};
//        int[] digits = {9,8,7,6,5,4,3,2,1,0};
//        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] digits = {2,4,9,3,9};
        int[] plusOne = plusOne(digits);
        System.out.println(Arrays.toString(plusOne));
    }

    private static int[] plusOne(int[] digits) {
        // 数组的长度
        int length = digits.length;
        // 最后一位数字
        int digit = digits[length - 1];
        // 具体的执行次数
        int time = 0;
        if (digit == 9) {
            for (int i = length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    time++;
                } else {
                    break;
                }
            }
        } else {
            digits[length - 1] = digits[length - 1] + 1;
            return digits;
        }
        if (time < length) {
            int i = length - time - 1;
            digits[i] = digits[i] + 1;
            return digits;
        } else {
            // 数组第一位置为0，其余都为0
            int[] result = new int[length + 1];
            result[0] = 1;
            return result;
        }
    }
}
