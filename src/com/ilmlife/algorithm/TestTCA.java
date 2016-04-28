package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 274 正三角形的外接圆面积
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年4月3日 下午19:07:58
 */
public class TestTCA {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			double m = cin.nextDouble();
			double r = m/2/Math.sin(Math.PI*60/180);
			System.out.println(String.format("%.2f", 3.1415926 * r * r));
		}
 	}
}