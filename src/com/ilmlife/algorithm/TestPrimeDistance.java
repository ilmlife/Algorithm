package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 24  素数距离问题
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestPrimeDistance {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		int nums[] = new int[group];
		for (int i = 0; i < group; i++) {
			nums[i] = cin.nextInt();
		}
		
		for (int i = 0; i < group; i++) {
			if(nums[i] == 1) {
				System.out.println("2 1");
				continue;
			}
			
			int distance = 0;
			while(true) {
				boolean left = true,right = true;
				int curLeft = nums[i] - distance;
				int curRight = nums[i] + distance;
				
				int mid = (int) Math.sqrt(curRight);
				for (int j = 2; j <= mid && (left || right); j++) {
					if((left && curLeft > j && curLeft % j == 0) || curLeft == 1) {
						left = false;
					}
					if(right && curRight % j == 0) {
						right = false;
					}
				}
				if(left) {
					System.out.println(curLeft + " " + distance);
					break;
				}
				if(right) {
					System.out.println(curRight + " " + distance);
					break;
				}
				distance ++;
			}
		}
	}
}
