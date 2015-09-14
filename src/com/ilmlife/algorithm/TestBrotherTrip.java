package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 97 兄弟郊游问题
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年9月13日 下午6:15:47
 */
public class TestBrotherTrip {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		while(group -- > 0) {
			int m = cin.nextInt();
			int x = cin.nextInt();
			int y = cin.nextInt();
			int z = cin.nextInt();
			
			System.out.println(String.format("%.2f", z * ((m * x * 1.0)/ (y -x))));
		}
	}
}
