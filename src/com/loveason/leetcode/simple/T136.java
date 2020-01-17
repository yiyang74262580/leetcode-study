package com.loveason.leetcode.simple;

/**
 * @author yangjie
 * @description 只出现一次的数字
 * @date 9:33 2020/1/17
 */
public class T136 {
    public static void main(String[] args) {
//        int[] nums = new int[]{2, 2, 1};
//        int[] nums = new int[]{4,1,2,1,2};
        int[] nums = new int[]{4,3,4,3,5,6,6};
        int num = singleNumber(nums);
        System.out.println(num);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        int length = nums.length;
        outer: for (int i = 0; i < length; i++) {
            // 是否首次相等、比较的次数
            int k = 0;
            for (int j = i + 1; j < length; j++) {
                // 确保i不超出数组范围
                if (i < length - 1) {
                    if (nums[i] == nums[j]) {
                        // 如果不是首次比较、则需要交换数组元素
                        if (k != 0) {
                            nums[j] = nums[i + 1];
                        }
                        ++i;
                        break;
                    } else {
                        k++;
                    }
                } else {
                    // 如果超出范围之后
                    result = nums[i];
                    break outer;
                }
                // 这个元素只出现了一次
                if (k + i + 1 == length) {
                    result = nums[i];
                    break outer;
                }
            }
            // 如果这个只出现一次的元素在数组的末尾
            result = nums[length - 1];
        }

        return result;
    }
}
