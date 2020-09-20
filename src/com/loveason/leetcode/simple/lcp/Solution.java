package com.loveason.leetcode.simple.lcp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.calculate("ABABABAB"));
        System.out.println(solution.game(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        System.out.println(solution.minCount(new int[]{2,3,10}));
    }

    /**
     * LCP 01. 猜数字
     * @param guess
     * @param answer
     * @return
     */
    public int game(int[] guess, int[] answer) {
        int r = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                r++;
            }
        }

        return r;
    }

    /**
     * LCP 06. 拿硬币
     * @param coins
     * @return
     */
    public int minCount(int[] coins) {
        int r = 0;
        for (int coin : coins) {
            if ((coin & 1) == 1) {
                r += (coin / 2) + 1;
            } else {
                r += coin / 2;
            }
        }
        return r;
    }

    /**
     * LCP 17. 速算机器人
     * @param s
     * @return
     */
    public int calculate(String s) {
        char[] chars = s.toCharArray();
        int x = 1;
        int y = 0;
        for (char aChar : chars) {
            if (aChar == 'A') {
                x = 2 * x + y;
            } else {
                y = 2 * y + x;
            }
        }

        return x + y;
    }


}