package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 11 奇偶数分离
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestOES {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		int nums[] = new int[group];
		for (int i = 0; i < group; i++) {
			nums[i] = cin.nextInt();
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j <= nums[i]; j+=2) {
				System.out.print(j);
				if(j + 2 > nums[i]) {
					System.out.println();
				}else {
					System.out.print(" ");
				}
			}
			for (int j = 2; j <= nums[i]; j+=2) {
				System.out.print(j);
				if(j + 2 > nums[i]) {
					System.out.println();
				}else {
					System.out.print(" ");
				}
			}
			
			if(i + 1 != nums.length) {
				System.out.println();
			}
		}
	}
}
