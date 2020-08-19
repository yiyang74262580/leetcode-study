package com.loveason.leetcode.simple;

import java.util.Arrays;

/**
 * 移动零
 * @author yangjie
 * @date 2020/8/19 9:42
 */
public class T283 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        new T283().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                for (int k = i; k < length; k++) {
                    if (nums[k] != 0) {
                        nums[i] = nums[k];
                        nums[k] = 0;
                        break;
                    }
                }
            }
        }
    }
}
