package com.loveason.leetcode.simple.lcof;

/**
 * 剑指 Offer 04. 二维数组中的查找
 * @author yangjie
 * @date 2020/8/19 15:06
 */
public class T04 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(new T04().findNumberIn2DArray(matrix, 0));
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; ) {
                // 等于每列的头
                int k = ints[j];
                if (target == k) {
                    return true;
                }
                if (target > k) {
                    j++;
                } else {
                    break;
                }
            }
        }
        return false;
    }
}
