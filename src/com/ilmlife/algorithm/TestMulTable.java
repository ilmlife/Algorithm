package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 463 九九乘法表
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年9月17日 下午6:10:47
 */
public class TestMulTable {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int m = cin.nextInt();
			for (int n = 1; n <= m; n++) {
				for (int i = n; i <= 9; i++) {
					System.out.print(n);
					System.out.print("*");
					System.out.print(i);
					System.out.print("=");
					System.out.print(i * n);
					if(i != 9) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}