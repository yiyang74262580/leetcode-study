package com.loveason.leetcode.simple;

import java.util.Arrays;

/**
 * 1480. 一维数组的动态和
 * @author yangjie
 * @date 2020/9/11 12:57
 */
public class T1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        int[] nums = {1,1,1,1,1};
//        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(new T1480().runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] r = new int[length];

        int k = 0;
        do {
            int s = nums[k];
            // 加上上一次的值
            if (k != 0) {
                r[k] = s + r[k - 1];
            } else {
                r[k] = s;
            }
            k++;
        } while (k != length);

        return r;
    }
}