package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 41 三个数从小到大排序  
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年8月30日 下午4:46:13
 */
public class Test3Sort {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if(a > c) {
			int temp = a;
			a = c;
			c = temp;
		}
		if(b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
