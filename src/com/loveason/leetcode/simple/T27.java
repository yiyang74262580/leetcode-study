package com.loveason.leetcode.simple;

import java.util.Arrays;

/**
 * @author alec
 * @description 移除元素
 * @date 13:33 2019/8/22
 */
public class T27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int removeElement = removeElement(nums, val);
        System.out.println(removeElement + ":" + Arrays.toString(nums));
    }

    private static int removeElement(int[] nums, int val) {
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                // 如果不相等，则把当前值赋值给当前下标的所在的位置
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }

        return currentIndex;
    }
}
