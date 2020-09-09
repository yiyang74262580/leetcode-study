package com.loveason.leetcode.simple.lcof;

import java.util.Arrays;

/**
 * 剑指 Offer 40. 最小的k个数
 * @author yangjie
 * @date 2020/9/4 14:03
 */
public class T40 {

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int k = 2;

        System.out.println(Arrays.toString(new T40().getLeastNumbers(arr, k)));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);

        int[] r = new int[k];
        if (k >= 0) {
            System.arraycopy(arr, 0, r, 0, k);
        }
        return r;
    }
}
