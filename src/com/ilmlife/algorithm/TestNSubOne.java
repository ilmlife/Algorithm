package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 96 n-1位数
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月07日 下午7:46:13
 */
public class TestNSubOne {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		for (int i = 0; i < group; i++) {
			int num = cin.nextInt();
			int range = 10;
			while(num > (range = range * 10)) {
			}
			
			System.out.println(num % (range / 10));
		}
	}
}