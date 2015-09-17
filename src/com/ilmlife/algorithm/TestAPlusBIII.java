package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 477 A+B Problem III
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月16日 下午6:50:34
 */
public class TestAPlusBIII {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			double a = cin.nextDouble();
			double b = cin.nextDouble();
			double c = cin.nextDouble();
			
			if(Math.abs(a + b - c) <= 0.0000001) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}