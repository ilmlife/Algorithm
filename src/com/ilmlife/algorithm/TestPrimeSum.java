package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 22 素数求和问题
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestPrimeSum {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();// 有多少组数据
		
		int result[] = new int[group];
		for (int i = 0; i < group; i++) {
			int num = cin.nextInt();
			for (int j = 0; j < num; j++) {
				int number = cin.nextInt();// 判定该数是否是素数
				if(number <= 1) {
					continue;
				}
				int loopNum = (int) Math.sqrt(number);
				boolean isPrime = true;
				for (int k = 2; k <= loopNum; k++) {
					if(number % k == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					result[i] += number;
				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}