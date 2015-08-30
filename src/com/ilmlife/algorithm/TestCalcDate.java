package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 75 日期计算
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年8月30日 下午4:19:27
 */
public class TestCalcDate {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		for (int i = 0; i < group; i++) {
			int year = cin.nextInt();
			int month = cin.nextInt();
			int day = cin.nextInt();
			
			
			int result = 0;
			for (int j = 1; j < month; j++) {
				if(j == 4 || j == 6 || j == 9 || j == 11) {
					result += 30;
				}else if(j == 2) {
					result += ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
				}else {
					result += 31;
				}
			}
			System.out.println(result + day);
		}
	}
}
