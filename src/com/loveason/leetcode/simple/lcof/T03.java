package com.loveason.leetcode.simple.lcof;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * @author yangjie
 * @date 2020/8/19 12:18
 */
public class T03 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(new T03().findRepeatNumber(nums));
    }

    public int findRepeatNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (s.contains(num)) {
                return num;
            } else {
                s.add(num);
            }
        }

        return 0;
    }
}
