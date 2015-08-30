package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 77 开灯问题
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年8月30日 下午6:08:18
 */
public class TestTurnOffLight {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int k = cin.nextInt();
		
		for (int i = 1; i <= n; i++) {
			boolean defaultOpen = true;
			for (int j = 2; j <= k && j <= i; j++) {
				if(i % j == 0) {
					defaultOpen = !defaultOpen;
				}
			}
			
			if(defaultOpen) {
				System.out.print(i + " ");
			}
		}
	}
}
