package com.ilmlife.algorithm;
import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 13 Fibonacci数
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestFibonacci {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();

		int nums[] = new int[group];
		for (int i = 0; i < group; i++) {
			nums[i] = cin.nextInt();
		}

		for (int i = 0; i < group; i++) {
			System.out.println(fn(nums[i]));
		}
	}

	public static int fn(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fn(n - 1) + fn(n - 2);
		}
	}

}
