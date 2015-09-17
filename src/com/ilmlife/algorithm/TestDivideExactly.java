package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 399 整除个数
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月16日 下午6:52:34
 */
public class TestDivideExactly {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while(cin.hasNextInt()) {
			int n = cin.nextInt();
			int b = cin.nextInt();
			
			System.out.println(n / b);
		}
	}
}
