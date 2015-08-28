package com.ilmlife.algorithm;

import java.util.Scanner;

public class Test6174 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		for(int i = 1; i <= group; i++) {
			int num = cin.nextInt();
			test6174(num, 0);
		}
	}
	
	public static void test6174(int num,int hasLoops) {
		char[] nums = String.valueOf(num).toCharArray();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					char temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		int min = Integer.parseInt(String.valueOf(nums));
		
		for (int begin = 0,end = nums.length - 1; begin < end; begin ++, end --) {
			char temp = nums[begin];
			nums[begin] = nums[end];
			nums[end] = temp;
		}
		int max = Integer.parseInt(String.valueOf(nums));
		int nextNum = max - min;
		hasLoops ++;
		if(nextNum == num) {
			System.out.println(hasLoops);
		}else {
			test6174(nextNum, hasLoops);
		}
	}
}

