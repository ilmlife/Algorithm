package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 40 公约数和公倍数
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestDM {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		for (int i = 0; i < group; i++) {
			int min = cin.nextInt();
			int max = cin.nextInt();
			
			if(min > max) {
				int temp = min;
				min = max;
				max = temp;
			}
			
			for (int m = min; m > 0; m--) {
				if(min % m == 0 && max % m == 0) {
					System.out.println(m + " " + (min * max /  m));
					break;
				}
			}
		}
	}
}


//public static int maxCommonDivisor2(int m, int n) {
//	if (m < n) {// 保证m>n,若m<n,则进行数据交换
//		int temp = m;
//		m = n;
//		n = temp;
//	}
//	while (m % n != 0) {// 在余数不能为0时,进行循环
//		int temp = m % n;
//		m = n;
//		n = temp;
//	}
//	return n;// 返回最大公约数
//}
