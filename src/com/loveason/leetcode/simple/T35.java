package com.loveason.leetcode.simple;

/**
 * @author alec
 * @description 搜索插入位置
 * @date 14:39 2019/8/24
 */
public class T35 {
    public static void main(String[] args) {
//        int[] nums = {1,3,5,6};
//        int target = 5;
//        int[] nums = {1,3,5,6};
//        int target = 2;
        int[] nums = {1,3,5,6};
        int target = 7;
//        int[] nums = {1,3,5,6};
//        int target = 0;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }

    private static int searchInsert(int[] nums, int target) {
        int tmp = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            // 数组中有相同的元素，直接返回下标
            if (target == nums[i]) {
                return i;
            } else if (target < nums[i]) {
                return i;
            } else {
                tmp++;
            }
            // 如果target是nums中的最大值，则返回tmp
            if (tmp == length) {
                return tmp;
            }
        }

        return 0;
    }
}
