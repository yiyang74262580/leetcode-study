package com.loveason.leetcode.simple;

import java.util.*;

/**
 * 1431. 拥有最多糖果的孩子
 * @author yangjie
 * @date 2020/9/12 22:17
 */
public class T1431 {

    public static void main(String[] args) {
        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(new T1431().kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = 0;
        for (int candy : candies) {
            if (candy > m) {
                m = candy;
            }
        }

        List<Boolean> list = new ArrayList<>(candies.length);
        for (int candy : candies) {
            if (candy + extraCandies >= m) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}
