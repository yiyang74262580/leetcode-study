package com.loveason.leetcode.simple;

import java.util.Arrays;

/**
 * 面试题 合并排序的数组
 * @author alec
 */
public class SortedMergeLcci {

    public static void main(String[] args) {
        int A[] = new int []{1,2,3,0,0,0}, m = 3;
        int B[] = new int []{2,5,6},       n = 3;
        new SortedMergeLcci().merge(A,m,B,n);
        System.out.println(Arrays.toString(A));
    }

    public void merge(int[] A, int m, int[] B, int n) {
        System.arraycopy(B, 0, A, m, n);
        Arrays.sort(A);
    }
}
