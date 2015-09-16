package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 263 精挑细选
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月15日 下午8:19:27
 */
public class TestChoose {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int dataNum = cin.nextInt();
			int longest = 0, thinest = 0, maxNO = 0;
			while(dataNum -- > 0) {
				int len = cin.nextInt();
				int thin = cin.nextInt();
				int NO = cin.nextInt();
				
				if(longest < len || (longest == len && (thin < thinest || (thin == thinest && NO > maxNO)))) {
					longest = len;
					thinest = thin;
					maxNO = NO;
				}
			}
			System.out.println(maxNO);
		}
	}
}