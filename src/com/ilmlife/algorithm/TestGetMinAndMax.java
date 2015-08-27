package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 31 求最值
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestGetMinAndMax {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int min = 0,max = 0;
		boolean frist = true;
		while(cin.hasNextInt()) {
			if(frist) {
				min = max = cin.nextInt();
				frist = false;
			}
			int now = cin.nextInt();
			if(min > now) {
				min = now;
			}
			if(max < now) {
				max = now;
			}
		}
		
		System.out.println(min + " " + max);
	}
}