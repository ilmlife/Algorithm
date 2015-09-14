package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 94 cigarettes
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年9月13日 下午6:19:47
 */
public class TestCigarettes {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		while(group -- > 0) {
			int n = cin.nextInt();
			int k = cin.nextInt();
			
			int roll = 0, butts = n;
			
			while((roll = butts / k) > 0) {
				butts = butts % k + roll;
				n += roll;
			}
			
			System.out.println(n);
		}
	}
}