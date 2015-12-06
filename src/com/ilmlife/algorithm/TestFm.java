package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 72 Financial Management
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月13日 下午2:07:58
 */
public class TestFm {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		double sum = 0.0;
		for (int i = 0; i < 12; i++) {
			sum += cin.nextDouble();
		}
		System.out.println(String.format("%.2f", sum / 12));
	}
}