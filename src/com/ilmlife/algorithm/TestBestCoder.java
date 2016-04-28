package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 596 谁是最好的Coder
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年4月1日 下午19:07:58
 */
public class TestBestCoder {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		do{
			int maxScore = 0;
			while(group -- > 0) {
				int a = cin.nextInt();
				int b = cin.nextInt();
				if(maxScore < a + b) {
					maxScore = a + b;
				}
			}
			System.out.println(maxScore);
			group = cin.nextInt();
		}while(group != 0);
	}
}