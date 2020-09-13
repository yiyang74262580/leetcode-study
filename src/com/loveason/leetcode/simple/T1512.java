package com.loveason.leetcode.simple;

/**
 * 1512. 好数对的数目
 * @author yangjie
 * @date 2020/9/11 21:26
 */
public class T1512 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,1,3};
//        int[] nums = new int[]{1,1,1,1};
        System.out.println(new T1512().numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    x++;
                }
            }
        }

        return x;
    }
}
