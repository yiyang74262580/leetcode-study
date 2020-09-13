package com.loveason.leetcode.simple;

import java.util.Arrays;

/**
 * 1470. 重新排列数组
 * @author yangjie
 * @date 2020/9/13 10:25
 */
public class T1470 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(new T1470().shuffle(nums, n)));
    }

    public int[] shuffle(int[] nums, int n) {
        int length = 2 * n;
        int[] r = new int[length];
        int k = 0;
        // 0和偶数下标赋值
        for (int i = 0; i < n; i++) {
            r[k] = nums[i];
            k = k + 2;
        }
        k = 1;
        // 奇数下标赋值
        for (int i = n; i < length; i++) {
            r[k] = nums[i];
            k = k + 2;
        }

        return r;
    }
}
