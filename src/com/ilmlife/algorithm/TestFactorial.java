package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 65 另一种阶乘问题
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年8月30日 下午1:56:34
 */
public class TestFactorial {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		for (int i = 0; i < group; i++) {
			int num = cin.nextInt();
			int sum = 0;
			for (int j = 1; j <= num; j+=2) {
				if(j + 1 <= num) {
					sum += (getThisFacorial(j) << 1);
				}else {
					sum += getThisFacorial(j);
				}
			}
			System.out.println(sum);
		}
	}
	
	public static int getThisFacorial(int n) {
		int factorial = 1;
		for (int i = 3; i <= n; i+=2) {
			factorial *= i;
		}
		return factorial;
	}
}
