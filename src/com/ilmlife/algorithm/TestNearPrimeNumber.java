package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 169 素数
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年4月3日 下午19:07:58
 */
public class TestNearPrimeNumber {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int x = cin.nextInt();
			int inc = 1;
			while(true) {
				if(inc == 1 && isPrime(x)) {
					System.out.println(x);
					break;
				}
				if(isPrime(x + inc)) {
					System.out.println(x + inc);
					break;
				}
				if(isPrime(x - inc)) {
					System.out.println(x - inc);
					break;
				}
				inc ++;
			}
		}
 	}
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		boolean isPrime = true;
		for(int i = 2; i < num; i ++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}