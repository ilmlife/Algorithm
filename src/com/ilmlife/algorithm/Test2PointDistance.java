package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 101 两点距离
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月11日 下午6:10:13
 */
public class Test2PointDistance {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();

		for (int i = 0; i < group; i++) {
			double x1 = cin.nextDouble();
			double y1 = cin.nextDouble();
			double x2 = cin.nextDouble();
			double y2 = cin.nextDouble();
			
			System.out.println(String.format("%.2f", Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2))));
		}
	}
}
