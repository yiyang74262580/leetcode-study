package com.loveason.leetcode.simple;

/**
 * 两数之和
 * @author alec
 */
public class T1 {
	public static void main(String[] args) {
		int test[] = twoSum(new int[]{1,3,4,2},6);
		System.out.println(test[0] + "," + test[1]);
	}

	private static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for(int i = 0; i < nums.length; i++){
			for(int j = nums.length - 1; j > 0; j--){
				if(nums[i] + nums[j] == target && i != j){
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return new int[]{6,6};
	}
}
