package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 324 猴子吃桃问题
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年4月1日 下午19:07:58
 */
public class TestMonkeyEatPeach {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int m = cin.nextInt();
			int num = 1;
			for (int i = 2; i <= m + 1; i++) {
				num = 2 * num + 2;
			}
			System.out.println(num);
		}
	}
}