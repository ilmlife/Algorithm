package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 559 奋斗的小蜗牛
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年9月17日 下午6:19:47
 */
public class TestStrugglingSnail {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int h = cin.nextInt();
			
			if(h <= 10) {
				System.out.println(1);
			}else {
				int day = h / 5;
				if(h % 5 > 0) {
					System.out.println(day);
				}else {
					System.out.println(day - 1);
				}
			}
		}
	}
}