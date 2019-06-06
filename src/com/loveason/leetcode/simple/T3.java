package com.loveason.leetcode.simple;

/**
 * 两数之和
 * @author alec
 */
public abstract class T3 {
	public static void main(String[] args) {
		System.out.println("完成了" + test("abcabcbb"));
		System.out.println("完成了" + test("bbbbb"));
	}

	private static int test(String str){
		String[] arr = str.split("");
		String[] newArr = new String[arr.length];
		int repeat = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < newArr.length; j++) {
				if (!arr[j].equals(newArr[j])){
					newArr[j] = arr[j];
					break;
				} else {
					System.out.println("没有啊");
				}
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		return -1;
	}
}
