package com.loveason.leetcode.simple;

import java.util.Arrays;

/**
 * @author yangjie
 * @description 旋转数组
 * @date 17:45 2020/1/22
 */
public class T189 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
//        int[] nums = {-1,-100,3,99};
        int k = 8;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int k) {
        // 最初的版本、速度太慢了、超出限制
        /*for (int i = 0; i < k; i++) {
            int length = nums.length;
            int lastNum = nums[length - 1];
            int times = 0;
            for (int j = 0; j <= length; j++) {
                if (length - j - 2 >= 0) {
                    nums[length - j - 1] = nums[length - j - 2];
                }
                times = j;
            }
            nums[length - times] = lastNum;
        }*/

        // 虽然通过了、评分太低了
        /*int length = nums.length;
        k = k % length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < length; j++) {
                int value = nums[j];
                int lengthN = length - 1;
                nums[j] = nums[lengthN];
                nums[lengthN] = value;
            }
        }*/

        // 虽然利用了其他空间，但是速度只需要0ms
        /*int length = nums.length;
        k = k % length;
        int[] firstArr = new int[k];
        int[] lastArr = new int[length - k];
        int index = 0;
        for (int i = length - k; i < length; i++) {
            firstArr[index] = nums[i];
            index++;
        }
        index = 0;
        for (int i = 0; i < length - k; i++) {
            lastArr[index] = nums[i];
            index++;
        }

        System.arraycopy(firstArr, 0, nums, 0, firstArr.length);
        System.arraycopy(lastArr, 0, nums, firstArr.length, lastArr.length);*/

        // 针对for的改进、虽然还是0ms，但是我觉得他更快了
        int length = nums.length;
        k = k % length;
        int[] firstArr = new int[k];
        int[] lastArr = new int[length - k];
        System.arraycopy(nums, length - k, firstArr, 0, firstArr.length);

        System.arraycopy(nums, 0, lastArr, 0, lastArr.length);

        System.arraycopy(firstArr, 0, nums, 0, firstArr.length);

        System.arraycopy(lastArr, 0, nums, firstArr.length, lastArr.length);
    }
}
