package com.loveason.leetcode.simple;

import java.util.Arrays;

/**
 * @author alec
 * @description 删除排序数组中的重复项
 * @date 10:34 2019/8/22
 */
public class T26 {
    public static void main(String[] args) {
        int[] ints = {0,0,1,1,1,2,2,3,3,4};
        int removeDuplicates = removeDuplicates(ints);
        System.out.println(removeDuplicates + ":" + Arrays.toString(ints));
    }

    private static int removeDuplicates(int[] nums) {
        // 数组没有元素，直接返回0
        if (nums.length == 0) {
            return 0;
        }
        // 拿到第一个相同的元素
        int top = nums[0];
        int less = 0;
        // 数组里不相同元素的长度
        int currentIndex = 0;
        // 已经拿了下标为0的元素了，直接从1开始
        for (int i = 1; i < nums.length; i++) {
            // 如果相同一直都是相同的元素，则把less++
            if (top == nums[i]) {
                // 如果遇到过了不相同的元素，则把新开始的相同的元素的第一个值赋值给nums
                if (less == 0) {
                    nums[currentIndex] = top;
                }
                less++;
            } else {
                // 如果遇到不相同的元素，则把top值修改为这个不相同的元素，并修改nums数组里面的值
                less = 0;
                top = nums[i];
                nums[++currentIndex] = top;
            }
        }

        return ++currentIndex;
    }
}
