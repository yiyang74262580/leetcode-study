package com.loveason.leetcode.simple;

/**
 * @author yangjie
 * @date 2020/9/13 18:02
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.xorOperation(1, 7));
        System.out.println(solution.numJewelsInStones("z", "ZZ"));

        System.out.println(solution.diagonalSum(new int[][]{
//                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1}
                {5}
        }));

        System.out.println(solution.defangIPaddr("1.1.1.1"));

        System.out.println(solution.toLowerCase("al&phaBET"));

        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(solution.countNegatives(grid));
    }

    /**
     * 1486. 数组异或操作
     * n = 5, start = 0
     *
     * @param n
     * @param start
     * @return
     */
    public int xorOperation(int n, int start) {
        int r = 0;
        for (int i = 0; i < n; i++) {
            r = r ^ start + 2 * i;
        }

        return r;
    }

    /**
     * 771. 宝石与石头
     *
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        char[] Jchars = J.toCharArray();
        char[] Schars = S.toCharArray();

        int r = 0;
        for (char c : Schars) {
            for (char j : Jchars) {
                if (j == c) {
                    r++;
                }
            }
        }

        return r;
    }

    /**
     * 1572. 矩阵对角线元素的和
     *
     * @param mat
     * @return
     */
    public int diagonalSum(int[][] mat) {
        int x = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i != mat[i].length - 1 - i) {
                x += mat[i][i] + mat[i][mat[i].length - 1 - i];
            } else {
                x += mat[i][i];
            }
        }

        return x;
    }

    /**
     * 1108. IP 地址无效化
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    /**
     * 709. 转换成小写字母
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 90 && chars[i] >= 65) {
                chars[i] += 32;
            }
        }

        return new String(chars);
    }

    /**
     * 1351. 统计有序矩阵中的负数
     * @param grid
     * @return
     */
    public int countNegatives(int[][] grid) {
        int x = 0;

        for (int[] ints : grid) {
            int length = ints.length;
            for (int i = 0; i < length; i++) {
                if (ints[i] < 0) {
                    x += length - i;
                    break;
                }
            }
        }

        return x;
    }

}


